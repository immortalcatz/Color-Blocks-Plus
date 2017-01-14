#!/usr/bin/env python3

'''
    Minecraft Colorize Blocks Generator
'''

import sys
import os
import shutil
import re
import yaml
import imghdr
import json



config_file = 'config.yaml'

exclude_dir  = re.compile(r'{0}(\..+|[e|E]xclude){0}'.format(os.path.sep))    # .hidden_dir/ or exclude/
exclude_file = re.compile(r'\.exclude(\.|$)')    # *.exclude.* or *.exclude File

def add_directory_lastsep(directory):
    return (directory + os.path.sep) if (re.search(os.path.sep + '$', directory) is None) else directory
def list_all_files(directory, show_root_dir=True, show_hidden_files=False):
    directory = add_directory_lastsep(directory)
    for root, dirs, files in os.walk(directory):
        root = add_directory_lastsep(root)
        for file in files:
            if (re.search(exclude_dir, root) is not None) or (re.search(exclude_file, file) is not None) or (show_hidden_files is False and file.startswith('.')):
                print('exclude: ' + os.path.join(root, file))
                continue
            elif show_root_dir is False:
                root = re.sub('^' + directory, '', root)
            yield os.path.join(root, file)
def use_double_quote_style(expression, enclosure=False):
    expression = json.dumps(expression, ensure_ascii=False) if expression is not None else ''
    if (enclosure is False) and (expression.startswith('"') and expression.endswith('"')):
        expression = expression[1:-1]
    return expression
def replace_tag(data, color=None):
    replace_lists = {
        'mod':   config['mod'],
        'block': config['block'],
    }
    if color:
        replace_lists['color'] = color
    # replace
    for config_category, config_list in replace_lists.items():
        for config_name, config_value in config_list.items():
            tag  = '___' + config_category + config_name[0].upper() + config_name[1:] + '___'
            text = use_double_quote_style(config_value)
            data = data.replace(tag, text)
    return data

with open(config_file) as f:
    config = yaml.load(f)
if config['block']['info']:
    config['block']['info'] += ' '
colors     = config['colors']
base_dir   = '.' + os.path.sep + add_directory_lastsep(config['templates']['base_dir'])
export_dir = '.' + os.path.sep + add_directory_lastsep(config['templates']['export_dir'])
templates  = list_all_files(base_dir, show_root_dir=False)



# Check Command-Line Options
if 1 < len(sys.argv):
    if config['mod']['jar_dir'] and ('-p' in sys.argv or '--production' in sys.argv):
        mod_file = '{0}/{1} - {2}.jar'.format(config['mod']['jar_dir'], config['mod']['name'], config['mod']['version'])
        if not os.path.isdir(config['mod']['jar_dir']):
            os.makedirs(config['mod']['jar_dir'])
        print('')
        print('')
        print('Preparing .jar file…')
        shutil.copyfile('build/libs/modid-1.0.jar', mod_file)
        print('')
        print('Mod file: {0}'.format(mod_file))
        print('')
    else:
        print('Usage: {0} [-p/--production]'.format(sys.argv[0]))
    sys.exit()



# Initialize export_dir
if os.path.isdir(export_dir):
    shutil.rmtree(export_dir)



'''
    Generate Codes
'''
for template in templates:
    base_file   = base_dir   + template
    export_file = export_dir + replace_tag(template)
    if not os.path.isdir(os.path.dirname(export_file)):
        os.makedirs(os.path.dirname(export_file))

    # Copy & Replace ___colorTag___.* File
    if '___color' in export_file:
        for color in colors:
            color_file = replace_tag(export_file, color)
            shutil.copyfile(base_file, color_file)
            with open(color_file, 'r') as f:
                data = f.read()
            data = replace_tag(data, color)
            with open(color_file, 'w') as f:
                f.write(data)
    # Copy & Replace Normal File
    else:
        shutil.copyfile(base_file, export_file)
        # if export_file is Image File
        if imghdr.what(export_file) is not None:
            continue

        newlines = ''
        with open(export_file) as f:
            for line in f:
                # ___colorTag___ Replace (Multi-line Expansion)
                if '___color' in line:
                    for color in colors:
                        newlines += replace_tag(line, color)
                # ___normalTag___ Replace
                else:
                    newlines += replace_tag(line)
        with open(export_file, 'w') as f:
            f.writelines(newlines)



'''
    Generate Textures
'''
texture_dir = '{0}main/resources/assets/{1}/textures/blocks/'.format(export_dir, config['mod']['id'])
if not os.path.isdir(texture_dir):
    os.makedirs(texture_dir)
for color in colors:
    os.system('convert -size 16x16 xc:{1} "{0}{2}.png"'.format(texture_dir, color['code'], color['id']))



print('')
print('GENERATE SUCCESSFUL')
print('')
