// https://www.hackerrank.com/challenges/pascals-triangle

object Solution {
  def pascal(col: Int, row: Int): Int = {
    if (col == 0 || col == row) 1
    else pascal(col - 1, row - 1) + pascal(col, row - 1)
  }

  def main(args: Array[String]) {
    val count = io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt).head
    for (row <- 0 to count - 1) {
      for (col <- 0 to row) {
        print(s"${pascal(col, row)} ")
      }
      println()
    }
  }
}

