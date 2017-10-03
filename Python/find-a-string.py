# https://www.hackerrank.com/challenges/find-a-string

def count_substring(string, sub_string):
    count = 0
    for i in range(0, len(string)):
        if string[i: i + len(sub_string)] == sub_string:
            count += 1
    return count
