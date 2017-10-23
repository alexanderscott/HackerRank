# https://www.hackerrank.com/challenges/collections-counter

from collections import Counter

_ = raw_input()
sizes_list = map(int, raw_input().split(" "))
sizes_ctr = Counter(sizes_list)

customer_count = int(raw_input())
earned = 0

for c in range(customer_count):
    (size_req, money) = tuple(map(int, raw_input().split(" ")))
    if sizes_ctr[size_req] > 0:
        earned += money
        sizes_ctr[size_req] -= 1

print(earned)
