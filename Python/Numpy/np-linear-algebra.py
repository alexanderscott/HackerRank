# https://www.hackerrank.com/challenges/np-linear-algebra

import numpy

N = int(raw_input())
arr = numpy.array([raw_input().split() for _ in range(N)], float)

print(numpy.linalg.det(arr))
