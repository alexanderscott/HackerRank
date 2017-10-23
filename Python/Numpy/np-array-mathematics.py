# https://www.hackerrank.com/challenges/np-array-mathematics

import numpy

N, M = map(int, raw_input().split())
A, B = (numpy.array([raw_input().split() for _ in range(N)], int) for _ in range(2))
print("\n".join(map(str, [A+B, A-B, A*B, A//B, A%B, A**B])))
