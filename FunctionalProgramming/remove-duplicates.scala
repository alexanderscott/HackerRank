// https://www.hackerrank.com/challenges/remove-duplicates

object Solution {
  def main(args: Array[String]): Unit = {
    println(scala.io.StdIn.readLine().trim().split("").distinct.mkString(""))
  }
}

