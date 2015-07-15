// https://www.hackerrank.com/challenges/string-mingling

object Solution {
  def main(args: Array[String]) {
    val lines = io.Source.stdin.getLines.toSeq.map(_.trim)
    val str1 = lines(0)
    val str2 = lines(1)

    val charArr1 = str1.toCharArray
    val charArr2 = str2.toCharArray

    for (i <- 0 to charArr1.length - 1) {
      print(charArr1(i))
      print(charArr2(i))
    }
  }

}

