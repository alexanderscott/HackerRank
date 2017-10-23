# https://www.hackerrank.com/challenges/python-string-formatting

def print_formatted(number):
    w = len(str(bin(number)).replace('0b',''))
    for i in xrange(1, number+1):
        b = bin(int(i)).replace('0b', '').rjust(w, ' ')
        o = oct(int(i)).replace('0', '', 1).rjust(w, ' ')
        h = hex(int(i)).replace('0x', '').upper().rjust(w, ' ')
        j = str(i).rjust(w, ' ')
        print j, o, h, b
