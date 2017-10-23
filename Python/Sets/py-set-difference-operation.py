# https://www.hackerrank.com/challenges/py-set-difference-operation

_ = raw_input()
en_enrollment = set(map(int, raw_input().split()))

_ = raw_input()
fr_enrollment = set(map(int, raw_input().split()))
print (len(en_enrollment - fr_enrollment))
