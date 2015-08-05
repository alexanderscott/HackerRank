// https://www.hackerrank.com/challenges/quicksort2

object Solution {

  def partition(arr: List[Int]): List[Int] = {
    if (arr.length <= 1) {
      arr
    } else {
      val pivot = arr.head

      val left = partition(arr.filter(_ < pivot)) 
      if (left.length > 1) println(left.mkString(" "))

      val right = partition(arr.filter(_ > pivot))
      if (right.length > 1) println(right.mkString(" "))

      left ::: arr.filter(_ == pivot) ::: right
    }
  }

  def main(args: Array[String]) {
    val n = readInt()
    val arr = readLine().split(" ").map(_.toInt).toList

    println(partition(arr).mkString(" "))
  }
}
