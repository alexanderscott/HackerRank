# https://www.hackerrank.com/challenges/np-transpose-and-flatten

import numpy

(N, M) = tuple(map(int, raw_input().split(" ")))

arr = []
for i in range(N):
    a = map(int, raw_input().split(" "))
    arr.append(a)

n_arr = numpy.array(arr)

print(numpy.transpose(n_arr))
print(n_arr.flatten())
