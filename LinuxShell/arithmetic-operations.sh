#!/bin/bash

# https://www.hackerrank.com/challenges/bash-tutorials---arithmetic-operations

read str
printf %.3f $(echo "$str" | bc -l)
