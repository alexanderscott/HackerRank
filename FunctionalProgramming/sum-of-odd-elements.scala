// https://www.hackerrank.com/challenges/fp-sum-of-odd-elements

def f(arr: List[Int]): Int = {
  def sum(arr: List[Int], total: Int = 0): Int = {
    if (arr.isEmpty) return total
    if (arr.head % 2 != 0) return sum(arr.tail, arr.head + total) 
    else return sum(arr.tail, total)
  }

  sum(arr)
}
