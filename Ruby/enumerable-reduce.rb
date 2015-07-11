# https://www.hackerrank.com/challenges/ruby-enumerable-reduce

def sum_terms(n)
    (1..n).inject(0) { |sum, i| sum + (i ** 2) + 1 }
end
