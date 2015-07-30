// https://www.hackerrank.com/challenges/tutorial-intro

object Solution {

  def sortPos(arr: Seq[Int], V: Int, idx: Int = 0): Int = {
    val mid = (arr.length / 2).floor.toInt 
    if (V == arr(mid)) mid + idx
    else if (V > arr(mid)) sortPos(arr.slice(mid, arr.length), V, idx + mid)
    else sortPos(arr.slice(0, mid), V, idx)
  }
  
  def main(args: Array[String]) {
    val V = readInt()
    val n = readInt()
    val arr = readLine().split(" ").map(_.toInt).toSeq

    println(sortPos(arr, V))
  }
}
