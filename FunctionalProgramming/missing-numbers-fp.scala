// https://www.hackerrank.com/challenges/missing-numbers-fp/problem

object Solution {
  def main(args: Array[String]): Unit = {
    readLine()
    val a = readLine().trim().split(" ")
    readLine()
    val b = readLine().trim().split(" ")

    println(b.diff(a).distinct.sorted.mkString(" "))
  }
}
