# https://www.hackerrank.com/challenges/np-sum-and-prod

import numpy

N, M = map(int, raw_input().split())
A = numpy.array([raw_input().split() for _ in range(N)], int)
print(numpy.prod(numpy.sum(A, axis=0), axis=0))
