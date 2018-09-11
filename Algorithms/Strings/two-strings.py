# https://www.hackerrank.com/challenges/two-strings

#!/bin/python3

import math
import os
import random
import re
import sys

def twoStrings(s1, s2):
    s1dict = dict.fromkeys(s1, 1)
    s2set = set(s2)
    for c in s2set:
        if c in s1dict:
            return "YES"
    return "NO"

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        s1 = input()

        s2 = input()

        result = twoStrings(s1, s2)

        fptr.write(result + '\n')

    fptr.close()
