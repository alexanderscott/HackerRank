# https://www.hackerrank.com/challenges/xml-1-find-the-score

def get_attr_number(node):
    a = len(node.attrib)
    for child in node:
        a = a + get_attr_number(child)
    return a
