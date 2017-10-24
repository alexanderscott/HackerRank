# https://www.hackerrank.com/challenges/np-mean-var-and-std

import numpy

N, M = map(int, raw_input().split())
arr = numpy.array([raw_input().split() for _ in range(N)], numpy.float)
print(numpy.mean(arr, axis = 1))
print(numpy.var(arr, axis = 0))
print(numpy.std(arr))
