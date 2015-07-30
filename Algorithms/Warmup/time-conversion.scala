// https://www.hackerrank.com/challenges/time-conversion

object Solution {

  def main(args: Array[String]) {
    val timeStrRaw = readLine()
    var timeStr = ""

    if (timeStrRaw.takeRight(2) == "AM" && timeStrRaw.take(2) == "12") {
      timeStr += "00"
    } else if (timeStrRaw.takeRight(2) == "PM" && timeStrRaw.take(2) != "12") {
      timeStr += (timeStrRaw.take(2).toInt + 12).toString
    } else {
      timeStr += timeStrRaw.take(2)
    }

    timeStr += timeStrRaw.drop(2).dropRight(2)
    println(timeStr)
  }
}
