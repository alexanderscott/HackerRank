# https://www.hackerrank.com/challenges/np-zeros-and-ones

import numpy

dimensions = map(int, raw_input().split())

print numpy.zeros(tuple(dimensions), dtype = numpy.int)
print numpy.ones(tuple(dimensions), dtype = numpy.int)
