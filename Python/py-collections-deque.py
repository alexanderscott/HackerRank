# https://www.hackerrank.com/challenges/py-collections-deque

from collections import deque

d = deque()

for _ in range(int(input())):
    raw_str = list(raw_input().split())
    eval('d.{0}({1})'.format(*raw_str+['']))
print(" ".join(map(str, list(d))))
