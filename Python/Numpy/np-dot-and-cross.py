# https://www.hackerrank.com/challenges/np-dot-and-cross

import numpy

N = int(raw_input())
A = numpy.array([raw_input().split() for _ in range(N)], numpy.int)
B = numpy.array([raw_input().split() for _ in range(N)], numpy.int)

print(numpy.dot(A, B))
