# https://www.hackerrank.com/challenges/symmetric-difference

_ = raw_input()
M = set(map(int, raw_input().split(" ")))
_ = raw_input()
N = set(map(int, raw_input().split(" ")))

diff = list(M.difference(N)) + list(N.difference(M))

print("\n".join(map(str, sorted(diff))))
