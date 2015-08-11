// https://www.hackerrank.com/challenges/trignometric-ratios

object Solution {
  def factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)

  def sin(x: Float): Float = {
    var sum = 0.toFloat
    var idx = 0

    for (i <- 1 until 11 by 2) {
      val incr = (Math.pow(x.toDouble, i.toDouble) / factorial(i)).toFloat
      if (idx % 2 == 0) sum += incr
      else sum -= incr
      idx += 1
    }

    sum
  }

  def cos(x: Float): Float = {
    var sum = 1.toFloat
    var idx = 1

    for (i <- 2 until 10 by 2) {
      val incr = (Math.pow(x.toDouble, i.toDouble) / factorial(i)).toFloat
      if (idx % 2 == 0) sum += incr
      else sum -= incr
      idx += 1
    }

    sum
  }

  def main(args: Array[String]) {
    io.Source.stdin.getLines.toSeq
      .drop(1)
      .map(_.trim)
      .map(_.toFloat)
      .foreach(i => {
        println(sin(i))
        println(cos(i))
      })
  }
}



