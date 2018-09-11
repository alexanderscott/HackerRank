// https://www.hackerrank.com/challenges/grading


import java.io.PrintWriter

object Solution {

    def getGrade(grade: Int): Int = {
        grade match {
            case x if x < 38 => grade
            case x if x % 5 < 3 => grade
            case x => {
                val diff = x % 5
                x + 5 - diff
            }
        }
    }


    def gradingStudents(grades: Array[Int]): Array[Int] = {
        grades.map(getGrade)
    }

    def main(args: Array[String]) {
        val scan = scala.io.StdIn

        val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = scan.readLine.trim.toInt

        val grades = Array.ofDim[Int](n)

        for (gradesItr <- 0 until n) {
            val gradesItem = scan.readLine.trim.toInt
            grades(gradesItr) = gradesItem}

        val result = gradingStudents(grades)

        fw.println(result.mkString("\n"))

        fw.close()
    }
}
