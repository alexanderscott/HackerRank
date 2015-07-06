#!/bin/bash

# https://www.hackerrank.com/challenges/bash-tutorials---getting-started-with-conditionals

read i
if [ $i == "Y" ] || [ $i == "y" ]; then
    echo "YES"
else
    echo "NO"
fi
