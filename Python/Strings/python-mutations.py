# https://www.hackerrank.com/challenges/python-mutations

def mutate_string(string, position, character):
    arr = list(string)
    arr[position] = character
    return ''.join(arr)
