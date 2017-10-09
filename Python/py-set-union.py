# https://www.hackerrank.com/challenges/py-set-union

_, en_set = raw_input(), set(raw_input().split())
_, fr_set = raw_input(), set(raw_input().split())
print(len(en_set | fr_set))
