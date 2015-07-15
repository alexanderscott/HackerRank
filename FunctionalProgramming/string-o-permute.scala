// https://www.hackerrank.com/challenges/string-o-permute

object Solution {

  def swapEvenStr(str: String, i: Int = 2): String = {
    if (i > str.length) return str
    val chars = str.toCharArray
    val charOrig = chars(i - 2)
    val charNew = chars(i - 1)
    val strStart = str.slice(0, i - 2)
    val strEnd = str.slice(i, str.length)
    swapEvenStr(strStart + charNew + charOrig + strEnd, i + 2)
  }

  def main(args: Array[String]) {
    val lines = io.Source.stdin.getLines.toSeq.drop(1).map(_.trim)
    for (line <- lines) {
      println(swapEvenStr(line))
    }
  }
}

