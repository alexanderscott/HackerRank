// https://www.hackerrank.com/challenges/camelcase

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    var s = sc.next()

    println(s.count(_.isUpper) + 1)
  }
}
