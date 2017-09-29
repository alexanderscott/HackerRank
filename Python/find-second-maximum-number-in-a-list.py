# https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list

n = int(raw_input())
arr = map(int, raw_input().split())
sorted_arr = sorted(arr, reverse=True)
unique_arr = []
[unique_arr.append(i) for i in sorted_arr if i not in unique_arr]
print(unique_arr[1])
