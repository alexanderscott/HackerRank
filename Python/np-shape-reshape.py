# https://www.hackerrank.com/challenges/np-shape-reshape

import numpy

arr = map(int, raw_input().split(" "))
n_arr = numpy.array(arr)
print(numpy.reshape(n_arr, (3, 3)))
