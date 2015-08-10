// https://www.hackerrank.com/challenges/lonely-integer

object Solution {
  import scala.collection.mutable

  def findLonely(arr: Seq[Int]): Int = {
    var tmpMap = mutable.Map.empty[Int, Int]
    var tmpArr = arr
    while (tmpArr.nonEmpty) {
      val tmpInt = tmpArr(0)
      if (tmpMap.contains(tmpInt)) {
        tmpMap.remove(tmpInt)
      } else {
        tmpMap.update(tmpInt, 1)
      }
      tmpArr = tmpArr.drop(1)
    }

    tmpMap.keys.toSeq(0)

  } 


  def main(args: Array[String]) {
    val n = readInt()
    val arr = readLine().split(" ").map(_.toInt).toSeq

    println(findLonely(arr))
  }

}
