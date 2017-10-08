# https://www.hackerrank.com/challenges/itertools-combinations-with-replacement

from itertools import combinations_with_replacement

s, k = raw_input().split()

for c in combinations_with_replacement(sorted(s), int(k)):
    print("".join(c))
