#https://www.hackerrank.com/challenges/incorrect-regex

import re

for i in range(int(raw_input())):
    try:
        if re.compile(raw_input()):
            print True
    except:
        print False
