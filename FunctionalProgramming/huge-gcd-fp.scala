// https://www.hackerrank.com/challenges/huge-gcd-fp/problem

import scala.annotation.tailrec

object Solution {

  @tailrec
  def gcd(x: BigInt, y: BigInt): BigInt = {
    if(y == 0) x else gcd(y, x % y)
  }

  def main(args: Array[String]) {
    readLine()
    val a = readLine().trim().split(" ").map(BigInt(_)).product
    readLine()
    val b = readLine().trim().split(" ").map(BigInt(_)).product
    println(gcd(a, b) % 1000000007)
  }
}
