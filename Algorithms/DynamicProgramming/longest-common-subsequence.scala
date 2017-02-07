// https://www.hackerrank.com/challenges/dynamic-programming-classics-the-longest-common-subsequence

object Solution {

  /**
    * Generic way to create memoized functions
    * @see https://stackoverflow.com/questions/25129721
    */
  case class Memo[I, K, O](f: I => O)(implicit ev: I => K) extends (I => O) {
    import scala.collection.mutable
    val cache: mutable.Map[K, O] = mutable.Map.empty[K, O]
    override def apply(x: I): O = cache.getOrElseUpdate(x, f(x))
  }

  def lcs[A](a: List[A], b: List[A]): List[A] = {
    type DP = Memo[(List[A], List[A]), (Int, Int), List[A]]
    implicit def encode(key: (List[A], List[A])): (Int, Int) = (key._1.length, key._2.length)

    implicit val o: Ordering[List[A]] = Ordering.by(_.length)

    lazy val f: DP = Memo {
      case (Nil, _) | (_, Nil) => Nil
      case (x :: xs, y :: ys) if x == y => x :: f(xs, ys)
      case (x, y) => o.max(f(x.tail, y), f(x, y.tail))
    }

    f(a, b)
  }

  def main(args: Array[String]) {
    val _ = readLine()
    val a = readLine().split(" ").map(_.toInt).toList
    val b = readLine().split(" ").map(_.toInt).toList

    println(lcs(a, b).mkString(" "))
  }

}