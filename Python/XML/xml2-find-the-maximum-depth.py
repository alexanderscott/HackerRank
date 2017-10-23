# https://www.hackerrank.com/challenges/xml2-find-the-maximum-depth

maxdepth = 0
def depth(elem, level):
    global maxdepth
    maxdepth = max(level + 1, maxdepth)
    for child in elem:
        maxdepth = depth(child, level + 1)
    return maxdepth
