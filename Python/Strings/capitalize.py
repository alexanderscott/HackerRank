# https://www.hackerrank.com/challenges/capitalize

def capitalize(string):
    word_arr = string.split(" ")
    return " ".join([word.capitalize() for word in word_arr])
