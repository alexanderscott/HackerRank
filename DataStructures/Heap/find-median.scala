import scala.collection.mutable

object Solution {

  def median(s: Seq[Int]): Double = {
    val (lower, upper) = s.sortWith((l, r) => l < r).splitAt(s.size / 2)
    if (s.size % 2 == 0) (lower.last + upper.head) / 2.toDouble else upper.head
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)

    val n = sc.nextInt
    val arr = mutable.ArrayBuffer.empty[Int]

    for(i <- 1 to n) {
      arr.append(sc.nextInt)

      println(median(arr))
    }
  }
}
