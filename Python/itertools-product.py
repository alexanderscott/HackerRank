# https://www.hackerrank.com/challenges/itertools-product

from __future__ import print_function
from itertools import product

a = [int(i) for i in raw_input().split()]
b = [int(i) for i in raw_input().split()]
c = list(product(a, b))
print(*c, sep=' ')
