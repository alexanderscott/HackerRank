// https://www.hackerrank.com/challenges/divisible-sum-pairs

import scala.annotation.tailrec

object Solution {

  private def isPair(k: Int, i: Int, j: Int): Boolean = {
    (i + j) % k == 0
  }

  private def countPairs(k: Int, i: Int, l: List[Int]): Int = {
    l.foldLeft(0)((memo: Int, j: Int) => {
      memo + (if (isPair(k, i, j)) 1 else 0)
    })
  }

  private def findPairs(k: Int, l: List[Int]): Int = {
    @tailrec
    def findPairsAccum(ints: List[Int], accum: Int = 0): Int = {
      ints match {
        case Nil => accum
        case h :: t => {
          findPairsAccum(t, countPairs(k, h, t) + accum)
        }
      }
    }
    findPairsAccum(l)
  }

  def main(args: Array[String]) {
    val n :: k :: Nil = readLine().split(" ").map(_.toInt).toList
    val l = readLine().split(" ").map(_.toInt).toList

    println(findPairs(k, l))
  }
}