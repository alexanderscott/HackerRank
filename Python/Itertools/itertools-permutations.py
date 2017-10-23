# https://www.hackerrank.com/challenges/itertools-permutations

from __future__ import print_function
from itertools import permutations

rawstr = raw_input().split()
S = rawstr[0]
n = int(rawstr[1])
p = list(permutations(S, n))
l = []

for i in p:
    l.append(''.join(i))


print(*sorted(l, key=str.lower), sep='\n')
