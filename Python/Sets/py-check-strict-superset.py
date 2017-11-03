# https://www.hackerrank.com/challenges/py-check-strict-superset

A = set(raw_input().split())
print(all(A > set(raw_input().split()) for _ in range(int(raw_input()))))
