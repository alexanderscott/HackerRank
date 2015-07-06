#!/bin/bash

# https://www.hackerrank.com/challenges/bash-tutorials---looping-and-skipping

for i in {1..99}
do
    modulo=$(($i % 2))
    if [ $modulo -ne 0 ]; then echo "$i"; fi
done


