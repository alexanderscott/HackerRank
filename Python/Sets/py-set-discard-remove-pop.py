# https://www.hackerrank.com/challenges/py-set-discard-remove-pop

n = input()
s = set(map(int, raw_input().split()))

for _ in range(int(input())):
    x = list(raw_input().split())
    eval('s.{0}({1})'.format(*x+['']))
print sum(s)
