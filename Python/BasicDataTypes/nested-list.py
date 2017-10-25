# https://www.hackerrank.com/challenges/nested-list

n = int(raw_input())
name_score_arr = [[raw_input(), float(raw_input())] for _ in range(n)]

low_score = sorted(list(set([score for name, score in name_score_arr])))[1]
print('\n'.join([a for a,b in sorted(name_score_arr) if b == low_score]))

