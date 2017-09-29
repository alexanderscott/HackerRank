# https://www.hackerrank.com/challenges/map-and-lambda-expression

cube = lambda x: x**3

def fibonacci(n):
    if n <= 1: return n
    else: return(fibonacci(n-1) + fibonacci(n-2))

n = int(raw_input())
print(map(cube, [fibonacci(x) for x in range(n)]))
