// https://www.hackerrank.com/challenges/maximizing-xor

object Solution {

  def maxXor(leftMost: Int, rightMost: Int): Int = {
    (leftMost to rightMost).foldLeft(0)((memo1, l1) => {
      Math.max((l1 to rightMost).foldLeft(0)((memo2, l2) => {
        Math.max(l1 ^ l2, memo2)
      }), memo1)
    })
  }


  def main(args: Array[String]) {
    val left = Console.readInt
    val right = Console.readInt

    val res = maxXor(left, right)
    println(res)
  }
}

