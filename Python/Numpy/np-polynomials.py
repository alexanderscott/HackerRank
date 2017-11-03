# https://www.hackerrank.com/challenges/np-polynomials

import numpy

a = numpy.array(raw_input().split(), float)
b = float(raw_input())

print(numpy.polyval(a, b))
