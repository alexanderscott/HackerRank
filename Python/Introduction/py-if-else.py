# https://www.hackerrank.com/challenges/py-if-else

if __name__ == '__main__':
    n = int(raw_input())
    if n % 2 != 0:
        print("Weird")
    elif 1 < n < 6:
        print("Not Weird")
    elif 5 < n < 21:
        print("Weird")
    else:
        print("Not Weird")

