// https://www.hackerrank.com/challenges/string-compression/problem

import scala.annotation.tailrec

object Solution {
  private def mkSub(c: Char, i: Int): String = {
    i match {
      case 1 => c.toString
      case _ => c.toString + i.toString
    }
  }

  @tailrec
  def compressChars(chars: List[Char], accum: String = "", i: Int = 1): String = {
    chars match {
      case Nil => accum
      case head :: tail if tail.isEmpty => accum + mkSub(head, i)
      case head :: tail => {
        if (head == tail.head)
          compressChars(tail, accum, i+1)
        else
          compressChars(tail, accum + mkSub(head, i))
      }
    }
  }

  def main(args: Array[String]) {
    val str = scala.io.StdIn.readLine().trim()
    println(compressChars(str.toList))
  }
}
