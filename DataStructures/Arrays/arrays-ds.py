# https://www.hackerrank.com/challenges/arrays-ds
import sys

n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]
print(' '.join(str(i) for i in list(reversed(arr))))