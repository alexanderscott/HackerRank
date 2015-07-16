// https://www.hackerrank.com/challenges/filter-elements

object Solution {
  import scala.collection.mutable

  def filterRepeat(K: Int, A: Seq[Int]): Seq[Int] = {
    val rKeys = A.foldLeft(mutable.Map.empty[Int, Int].withDefaultValue(0))((memo, a) => {
      memo(a) += 1
      memo
    }).toMap.filter(_._2 >= K).keys.toSeq

    A.intersect(rKeys)
  }

  def main(args: Array[String]) {
    val lines = io.Source.stdin.getLines.toSeq.map(_.trim).drop(1)
    var i = 0
    var K = 0
    while (i < lines.length) {
      if (i % 2 == 0) {
        K = lines(i).split(" ").toSeq(1).toInt
      } else {
        val repeated = filterRepeat(K, lines(i).split(" ").toSeq.map(_.toInt))
        if (repeated.length == 0) println(-1)
        else println(repeated.mkString(" "))
      }
      i += 1
    }
  }
}

