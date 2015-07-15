// https://www.hackerrank.com/challenges/eval-ex

def f(x: Float): Float = {   
  def factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)

  var tmp: Double = 1.toDouble
  (1 to 9).foreach(i => {
    val pow = Math.pow(x.toDouble, i.toDouble)
    val div = pow / factorial(i).toFloat
    println(s"i: $i, pow: $pow, div: $div")

    tmp += div
  })
  tmp.toFloat
}

