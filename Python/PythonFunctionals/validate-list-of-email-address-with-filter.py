# https://www.hackerrank.com/challenges/validate-list-of-email-address-with-filter

import re

def fun(s):
    return re.match(r"(^[a-zA-Z0-9_+-]+@[a-zA-Z0-9]+\.[a-zA-Z0-9-.]\w{0,2}$)", s)

