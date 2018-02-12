# https://www.hackerrank.com/challenges/big-sorting
import sys

if __name__ == "__main__":
    n = int(raw_input().strip())
    arr = []
    arr_i = 0
    for arr_i in xrange(n):
        arr_t = str(raw_input().strip())
        arr.append(arr_t)

    arr.sort(key=int)
    for x in arr:
        print(x)
