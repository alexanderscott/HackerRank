// https://www.hackerrank.com/challenges/jumping-bunnies

object Solution {
  import scala.collection.mutable

  def gcd(x: Long, y: Long): Long = {
    if(y == 0) x else gcd(y, x % y)
  }

  def main(args: Array[String]) {
    val n = readLine()
    val distances = readLine().split(' ').map(_.toLong)
    
    val arr = mutable.ArrayBuffer[Long](1)

    for (i <- 0 until distances.length) {
      arr(0) = arr(0) / gcd(arr(0), distances(i)) * distances(i)
    }

    println(arr(0))
  }
}

