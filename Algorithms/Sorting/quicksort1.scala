// https://www.hackerrank.com/challenges/quicksort1

object Solution {

  def partition(arr: List[Int]): List[Int] = {
    arr.filter(_ < arr.head) ::: arr.filter(_ >= arr.head)
  }

  def main(args: Array[String]) {
    val n = readInt()
    val arr = readLine().split(" ").map(_.toInt).toList

    println(partition(arr).mkString(" "))
  }
}
