# https://www.hackerrank.com/challenges/python-tuples

n = int(raw_input())
integer_list = map(int, raw_input().split())
integer_tuple = tuple(integer_list)
print(hash(integer_tuple))
