// https://www.hackerrank.com/challenges/common-divisors

object Solution {
  import scala.collection.mutable

  def getDivisors(i: Int): Seq[Int] = {
    var j = i
    var k = 1
    val tmpList = mutable.ArrayBuffer[Int]()
    if (i == 1) return Seq(1)
    while (k < j - 1) {
      if (i % k == 0) {
        val divis = i / k
        if (k == divis) tmpList.append(k)
        else tmpList.append(k, divis)

        j = divis
      }
      k += 1
    }
    tmpList
  }

  def main(args: Array[String]): Unit = {
    val n = io.StdIn.readInt()
    (0 until n) foreach { _ =>
      val scores = io.StdIn.readLine().split(" ").map(_.toInt)
      val (m, l) = (getDivisors(scores.head), getDivisors(scores(1)))
      println(m.intersect(l).size)
    }
  }
}
