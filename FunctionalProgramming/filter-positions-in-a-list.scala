// https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list

def f(arr: List[Int]): List[Int] = {
  val l = scala.collection.mutable.ListBuffer.empty[Int]
  var idx = 0
  arr.foreach(i => {
    idx += 1
    if (idx % 2 == 0) l += i
  })
  
  l.toList
}
