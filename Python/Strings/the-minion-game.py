# https://www.hackerrank.com/challenges/the-minion-game

def minion_game(string):
    vowels = frozenset('AEIOU')

    stuart_score = 0
    kevin_score = 0
    ln = len(string)

    for i in range(ln):
        diff = ln - i
        if string[i] in vowels:
            kevin_score += diff
        else:
            stuart_score += diff

    if stuart_score > kevin_score:
        print("Stuart {}".format(stuart_score))
    elif stuart_score < kevin_score:
        print("Kevin {}".format(kevin_score))
    else:
        print("Draw")
