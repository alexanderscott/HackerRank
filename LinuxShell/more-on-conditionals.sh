#!/bin/bash

# https://www.hackerrank.com/challenges/bash-tutorials---more-on-conditionals

read a
read b
read c

if [ $a == $b ] && [ $b == $c ]; then
    echo "EQUILATERAL"
elif [ $a == $b ] || [ $a == $c ] || [ $b == $c ]; then
    echo "ISOSCELES"
else
    echo "SCALENE"
fi
