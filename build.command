#!/bin/bash

cd "$(dirname "$0")"
source ./bash_util



function build() {
    ./generator.py && ./gradlew build && ./generator.py --production
}



while true; do
    build
    *echo '* REBUILD [PRESS ENTER] *'
    read INPUT
done
