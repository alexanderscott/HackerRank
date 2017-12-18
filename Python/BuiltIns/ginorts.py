# https://www.hackerrank.com/challenges/ginorts

from __future__ import print_function

print(*(sorted(raw_input(), key=lambda x: (x.isdigit(), x.isdigit() and int(x)%2==0, x.isupper(), x.islower(), x))), sep='')
