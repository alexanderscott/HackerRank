# https://www.hackerrank.com/challenges/np-min-and-max/problem

import numpy

N, M = map(int, raw_input().split())
A = numpy.array([raw_input().split() for _ in range(N)], int)

print(numpy.max(numpy.min(A, axis=1), axis=0))
