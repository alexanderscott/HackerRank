# https://www.hackerrank.com/challenges/np-concatenate

import numpy

(N, M, P) = map(int, raw_input().split())
arr_n = numpy.array([raw_input().split() for _ in range(N)], int)
arr_m = numpy.array([raw_input().split() for _ in range(M)], int)
print(numpy.concatenate((arr_n, arr_m), axis = 0))
