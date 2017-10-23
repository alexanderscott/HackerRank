# https://www.hackerrank.com/challenges/floor-ceil-and-rint

import numpy

arr = map(float, raw_input().split())
n_arr = numpy.array(arr)

print(numpy.floor(n_arr))
print(numpy.ceil(n_arr))
print(numpy.rint(n_arr))
