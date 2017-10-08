# https://www.hackerrank.com/challenges/zipped

X, N = tuple(map(int, raw_input().split(" ")))

all_scores = []
for i in range(N):
    student_scores = map(float, raw_input().split(" "))
    all_scores.append(student_scores)

scores_zipped = zip(*all_scores)

for i in scores_zipped:
    total_score = sum(list(i)) / float(len(list(i)))
    print("%.1f" % total_score)
