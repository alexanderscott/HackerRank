# https://www.hackerrank.com/challenges/reduce-function

import operator

def product(fracs):
    t =  reduce(operator.mul , fracs)
    return t.numerator, t.denominator
