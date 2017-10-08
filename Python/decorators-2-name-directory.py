# https://www.hackerrank.com/challenges/decorators-2-name-directory

def person_lister(f):
    def inner(people):
        return map(f, sorted(people, key=lambda x: int(x[2])))
    return inner
