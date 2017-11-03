# https://www.hackerrank.com/challenges/python-mod-divmod

a, b = int(raw_input()), int(raw_input())
print("{d[0]}\n{d[1]}\n{d}".format(d=divmod(a, b)))
