# https://www.hackerrank.com/challenges/py-set-add

if __name__ == '__main__':
    n = int(raw_input())
    s = set()
    for i in range(n):
        country = raw_input()
        s.add(country)
    print(len(s))

