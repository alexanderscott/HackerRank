// https://www.hackerrank.com/challenges/fp-filter-array

def f(delim: Int, arr: List[Int]): List[Int] = {
  val l = scala.collection.mutable.ListBuffer.empty[Int]
  arr.foreach(i => {
    if (i < delim) l += i
  })
  
  l.toList
}
