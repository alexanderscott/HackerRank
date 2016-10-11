// https://www.hackerrank.com/challenges/rotate-string

object Solution {

	def rotate(s: String, arr: Seq[String] = Seq.empty[String]): Seq[String] = {
		val rStr = s.tail :+ s.head
		if (s.length != arr.length) {
			rotate(rStr, arr :+ rStr)
		} else {
			arr
		}
	}


	def main(args: Array[String]) {
		for (_ <- 0 until readInt) {
			val s = readLine().trim
			println(rotate(s).mkString(" "))
		}
	}
}
