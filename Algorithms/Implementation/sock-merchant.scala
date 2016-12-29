// https://www.hackerrank.com/challenges/sock-merchant

object Solution {

  private def countPairs(socks: Seq[Int]): Int = {
    socks
      .groupBy(x => x)
      .mapValues((l: Seq[Int]) => {
        val s = l.size
        (s - (s % 2)) / 2
      })
      .values
      .sum
  }

  def main(args: Array[String]) {
    val _ = readLine()

    val l = readLine().split(" ").map(_.toInt).toSeq

    println(countPairs(l))
  }
}

