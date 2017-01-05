#!/bin/bash

cd "$(dirname "$0")"
source ./bash_util



function build() {
    ./generator.py && ./gradlew build
}



while true; do
    build
    *echo '* REGENERATE & REBUILD [PRESS ENTER] *'
    read INPUT
done
