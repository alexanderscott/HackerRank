# https://www.hackerrank.com/challenges/python-print

from __future__ import print_function

if __name__ == '__main__':
    n = int(raw_input())
    print(*range(1, int(n+1)), sep='')
