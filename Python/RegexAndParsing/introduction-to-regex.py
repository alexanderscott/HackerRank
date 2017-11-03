# https://www.hackerrank.com/challenges/introduction-to-regex

import re

T = int(raw_input())
for _ in range(T):
    print(bool(re.match(r'^[-+]?[0-9]*\.[0-9]+$', raw_input())))
