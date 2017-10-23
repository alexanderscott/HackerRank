# https://www.hackerrank.com/challenges/py-set-intersection-operation

_ = raw_input()
M = set(map(int, raw_input().split(" ")))
_ = raw_input()
N = set(map(int, raw_input().split(" ")))

print(len(M.intersection(N)))
