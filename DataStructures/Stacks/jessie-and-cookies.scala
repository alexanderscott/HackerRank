// https://www.hackerrank.com/challenges/jesse-and-cookies

import scala.collection.mutable

object Solution {

  def combineForSweetness(cookies: mutable.PriorityQueue[Int], minSweetness: Int, combines: Int = 0): Int = {
    cookies.dequeue() match {
      case x if x < minSweetness && cookies.isEmpty => -1
      case x if x >= minSweetness => combines
      case x => {
        val n = x + (2 * cookies.dequeue())
        cookies.enqueue(n)
        combineForSweetness(cookies, minSweetness, combines + 1)
      }
    }
  }


  def main(args: Array[String]) {
    val n :: minSweetness :: Nil = readLine().split(" ").map(_.toInt).toList
    val cookies = readLine().split(" ").map(_.toInt).toSeq

    val pq = mutable.PriorityQueue.apply(cookies:_*)(
      implicitly[Ordering[Int]].reverse
    )

    println(combineForSweetness(pq, minSweetness))
  }
}