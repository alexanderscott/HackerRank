# https://www.hackerrank.com/challenges/standardize-mobile-number-using-decorators

def wrapper(f):
    def fun(l):
        f('+91 {} {}'.format(n[-10:-5], n[-5:]) for n in l)
    return fun
