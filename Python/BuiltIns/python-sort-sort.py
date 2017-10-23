# https://www.hackerrank.com/challenges/python-sort-sort

#!/bin/python

import sys

if __name__ == "__main__":
    n, m = raw_input().strip().split(' ')
    n, m = [int(n), int(m)]
    arr = []
    for arr_i in xrange(n):
        arr_temp = map(int,raw_input().strip().split(' '))
        arr.append(arr_temp)
    k = int(raw_input().strip())
    arr.sort(key=lambda arr_temp: arr_temp[k])
    for arr_temp in arr:
        print(" ".join(str(x) for x in arr_temp))

