# https://www.hackerrank.com/challenges/finding-the-percentage

if __name__ == '__main__':
    n = int(raw_input())
    student_marks = {}
    for _ in range(n):
        line = raw_input().split()
        name, scores = line[0], line[1:]
        scores = map(float, scores)
        student_marks[name] = scores
    query_name = raw_input()
    scores_list = student_marks[query_name]
    avg_score = sum(scores_list) / float(len(scores_list))
    print("{0:.2f}".format(avg_score))
