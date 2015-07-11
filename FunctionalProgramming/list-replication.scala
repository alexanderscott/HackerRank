// https://www.hackerrank.com/challenges/fp-list-replication

def f(num: Int, arr: List[Int]): List[Int] = {
  val l = scala.collection.mutable.ListBuffer.empty[Int]
  arr.foreach(i => {
    println(i)
    (1 to num).foreach(_ => l += i)
  })
  
  l.toList
}
