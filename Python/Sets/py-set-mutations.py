# https://www.hackerrank.com/challenges/py-set-mutations

_ = raw_input()
A = set(raw_input().split())
N = int(raw_input())

for _ in range(N):
    cmd, _ = raw_input().split()
    B = set(raw_input().split())
    getattr(A, cmd)(B)

print(sum(map(int, A)))
