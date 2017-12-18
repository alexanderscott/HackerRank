# https://www.hackerrank.com/challenges/py-collections-namedtuple

from collections import namedtuple
students, marks = int(raw_input()), raw_input().split().index("MARKS")
avg = float(sum([int(raw_input().split()[marks]) for _ in range(students)])) / float(students)
print("{0:.2f}".format(avg))
