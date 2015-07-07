// https://www.hackerrank.com/challenges/string-reductions

import scala.collection.mutable

object Solution {

  def main(args: Array[String]) {
    val hs = mutable.LinkedHashSet.empty[Char]    // preserves set order
    for (ln <- io.Source.stdin.getLines) {
      hs ++= ln.toSeq
    }
    println(hs.mkString(""))
  }
}
