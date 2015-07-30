// https://www.hackerrank.com/challenges/hackerrank-tweets

object Solution {

  def main(args: Array[String]) {
    var i = 0
    val pattern = "(?i)(.*)hackerrank(.*)"
    var count = 0
    for (ln <- io.Source.stdin.getLines) {
      if (i != 0) { 
        if(ln.matches(pattern)) count = count + 1
      }
      i += 1
    }
    println(count)
  }
}
