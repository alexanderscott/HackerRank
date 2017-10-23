# https://www.hackerrank.com/challenges/exceptions

n = int(raw_input())

for i in range(n):
    (a, b) = tuple(raw_input().split(" "))

    try:
        print(int(a) / int(b))
    except ZeroDivisionError as e:
        print "Error Code:", e
    except ValueError as e:
        print "Error Code:", e
