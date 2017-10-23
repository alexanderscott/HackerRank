# https://www.hackerrank.com/challenges/python-lists

n = int(raw_input())
l = []

for _ in range(n):
    s = raw_input().split()
    cmd = s[0]
    args = s[1:]
    if cmd != "print":
        cmd += "(" + ",".join(args) + ")"
        eval("l." + cmd)
    else:
        print l
