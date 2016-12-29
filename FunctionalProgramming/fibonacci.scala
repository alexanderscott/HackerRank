// https://www.hackerrank.com/challenges/fibonacci-fp
import scala.annotation.tailrec

object Solution {
  final val mod: Long = (Math.pow(10, 8) + 7).toLong

  private def fib(x: Long): Long = {
    @tailrec
    def fib_tail(n: Long, a: Long, b: Long): Long = n match {
      case 0 => a
      case _ => fib_tail(n - 1, b, (a % mod) + (b % mod) % mod)
    }

    fib_tail(x, 0, 1)
  }


  private def fibWithMod(i: Long): Long = {
    fib(i) % mod
  }

  def main(args: Array[String]) {
    val n = readLine().toInt

    (0 until n) foreach { _ =>
      println(fibWithMod(readLine().toLong))
    }
  }

}
