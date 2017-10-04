# https://www.hackerrank.com/challenges/any-or-all

def is_palindrome(n):
    num = n
    rev = 0
    while num > 0:
        dig = num % 10
        rev = rev * 10 + dig
        num = num / 10
    if n == rev:
        return True
    else:
        return False

_ = raw_input()
int_list = map(int, raw_input().split(" "))
palindrome_bool_list = [is_palindrome(i) for i in int_list]

all_positive = all([i > 0 for i in int_list])

print(all_positive and any(palindrome_bool_list))

