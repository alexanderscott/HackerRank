# https://www.hackerrank.com/challenges/list-comprehensions

(x, y, z, n) = tuple(map(int, [raw_input(), raw_input(), raw_input(), raw_input()]))

print ([[a,b,c] for a in range(0, x+1) for b in range(0, y+1) for c in range(0, z+1) if a + b + c != n])
