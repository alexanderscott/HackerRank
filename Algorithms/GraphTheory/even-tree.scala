/** https://www.hackerrank.com/challenges/even-tree **/

import scala.collection.mutable
import scala.io.Source

object Solution {

  def main(args: Array[String]) {
    val input = Source.stdin.getLines().toList
    val numNodes = input.head.split(" ").map(_.toInt).head

    val tree = Array.fill(numNodes + 1)(0)
    val treeMap: mutable.Map[Int, Int] = mutable.Map()

    input.tail.foreach(edgeStr => {
      val edgeNums = edgeStr.split(" ").map(_.toInt)
      val n = edgeNums(0)
      val p = edgeNums(1)

      tree(n) = p
      if (treeMap.get(p).isEmpty) treeMap.put(p, 1)
      if (treeMap.get(n).isEmpty) treeMap.put(n, 1)

      // Increment the count for parent node
      val count = treeMap(p)
      treeMap.put(p, count + 1)
    })

    var removedEdges = 0

    for (i <- Range(tree.length - 1, 1, -1)) {
      if (treeMap(i) % 2 == 0) {
        var even = false
        for (j <- Range(tree.length - 1, 1, -1)) {
          if (tree(j) == i) {
            val node = j
            if (treeMap(node) % 2 == 0) {
              even = true
            }
          }
        }

        if (!even) {
          // remove the edge
          val p = tree(i)
          tree(i) = 0
          val count = treeMap(p)
          treeMap.put(p, count - 1)

          // increment counter
          removedEdges += 1
        }
      }
    }

    println(removedEdges)
  }
}
