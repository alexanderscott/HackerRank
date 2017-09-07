// https://www.hackerrank.com/challenges/maxsubarray

object Solution {

  def maxSubArraySum(s: Seq[Int]): Int = {
    val maxPositive = s.scanLeft(0){_ + _ max 0}.max
    if (maxPositive == 0) s.max
    else maxPositive
  }

  def maxNonContiguousSum(s: Seq[Int]): Int = {
    val maxPositive = s.filter(_ > 0).sum
    if (maxPositive == 0) s.max
    else maxPositive
  }

  def main(args: Array[String]) {
    val cases = readLine().trim().toInt
    for (i <- 0 until cases) {
      val _ = readLine()
      val arr = readLine().split(" ").map(_.toInt).toList
      val maxContig = maxSubArraySum(arr)
      val maxNonContig = maxNonContiguousSum(arr)
      println(s"$maxContig $maxNonContig")
    }
  }

}