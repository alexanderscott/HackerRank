// https://www.hackerrank.com/challenges/compare-the-triplets

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    var a0 = sc.nextInt()
    var a1 = sc.nextInt()
    var a2 = sc.nextInt()
    var b0 = sc.nextInt()
    var b1 = sc.nextInt()
    var b2 = sc.nextInt()

    val aliceScores = Seq(a0, a1, a2)
    val bobScores = Seq(b0, b1, b2)

    var aliceScore = 0
    var bobScore = 0

    for (i <- aliceScores.indices) {
      aliceScores(i) match {
        case x if x > bobScores(i) => aliceScore += 1
        case x if x < bobScores(i) => bobScore += 1
        case _ => ()
      }
    }

    println(s"$aliceScore $bobScore")
  }
}
