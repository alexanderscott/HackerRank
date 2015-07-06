# https://www.hackerrank.com/challenges/ruby-enumerable-each-with-index

def skip_animals(animals, skip)
  arr = []
  animals.each_with_index { |item, index| 
    if index + 1 > skip then arr.push("#{index}:#{item}") end
  }
  arr
end
