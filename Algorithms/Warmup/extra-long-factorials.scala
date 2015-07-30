// https://www.hackerrank.com/challenges/extra-long-factorials

import java.math.BigInteger

object Solution {

  def main(args: Array[String]) {
    val n = readInt()
    var c = 0
    var sum: BigInteger = new BigInteger("1")
    while (c < n) {
      sum = sum.multiply(new BigInteger((n - c).toString))
      c += 1
    }
    println(sum.toString)
  }
}
