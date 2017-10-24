# https://www.hackerrank.com/challenges/np-inner-and-outer

import numpy

A = numpy.array([raw_input().split()], numpy.int)
B = numpy.array([raw_input().split()], numpy.int)

print(numpy.inner(A, B)[0][0])
print(numpy.outer(A, B))
