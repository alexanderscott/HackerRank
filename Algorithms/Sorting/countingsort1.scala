// https://www.hackerrank.com/challenges/countingsort1

import scala.collection.mutable

object Solution {

  def main(args: Array[String]) {
    val n = readInt()
    val arr = readLine().split(" ").map(_.toInt).toSeq

    val countMap = mutable.Map.empty[Int, Int].withDefaultValue(0)
    val countArr = mutable.ArrayBuffer.empty[Int]

    for(i <- arr) {
      countMap(i) += 1
    }

    for(i <- 0 to 100) {
      countArr += countMap(i)
    }

    println(countArr.mkString(" "))
  }
}

