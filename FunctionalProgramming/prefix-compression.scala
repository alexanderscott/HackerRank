// https://www.hackerrank.com/challenges/prefix-compression

object Solution {

	def main(args: Array[String]) {
		val (x :: y :: Nil) = io.Source.stdin.getLines.take(2).toList

		val prefix: String = x.zip(y).takeWhile { case (a, b) => a == b }.map(_._1).mkString

		println(s"${prefix.length} $prefix")

		Seq(x, y).foreach(str => {
			val strAfter = str.substring(prefix.length)
			println(s"${strAfter.length} $strAfter")
		})

	}
}
