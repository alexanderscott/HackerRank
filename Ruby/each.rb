# https://www.hackerrank.com/challenges/ruby-tutorial-each

def scoring(array)
  array.each do |user|
    user.update_score
  end
end

