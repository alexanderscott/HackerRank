# https://www.hackerrank.com/challenges/mini-max-sum

import sys

def miniMaxSum(arr):
    total_sum = sum(arr)
    print("{} {}".format(total_sum - max(arr), total_sum - min(arr)))

if __name__ == "__main__":
    arr = map(int, raw_input().strip().split(' '))
    miniMaxSum(arr)
