// https://www.hackerrank.com/challenges/minimum-average-waiting-time

import scala.collection.mutable

object Solution {

  case class Customer(t: Long, l: Long) {
    override def toString(): String = s"Customer t: $t, l: $l"
  }

  def main(args: Array[String]) {
    def customerOrdering = new Ordering[Customer] {
      def compare(a: Customer, b: Customer) = {
        b.l compare a.l
      }
    }

    val pQueue = new mutable.PriorityQueue[Customer]()(customerOrdering)

    var customerCount = 0 
    var counter = 0
    val customersUnsorted = mutable.ArrayBuffer.empty[Customer]
    for (ln <- io.Source.stdin.getLines) {
      counter += 1
      if (counter == 1) {
        customerCount = ln.toInt
      } else {
        val customer = Customer(ln.split(" ").head.toInt, ln.split(" ").last.toInt)
        customersUnsorted += customer
      }
    }


    val customers = customersUnsorted.sortWith(_.t < _.t)
    //println(s"Customers sorted: ${customers.map(_.toString)}")

    var totalTime = 0L
    var currTime = 0L

    while (customers.nonEmpty || pQueue.nonEmpty) {
      while (customers.nonEmpty && (pQueue.isEmpty || customers(0).t <= currTime)) {
        val c = customers.head
        customers -= c
        pQueue.enqueue(c)
        //println(s"Enqueued t: ${c.t}, l: ${c.l}")
        currTime = Math.max(currTime, c.t)
      }

      val c = pQueue.dequeue()
      //println(s"Dequeued ar: ${c.t}, ct: ${c.l}")
      currTime += c.l
      totalTime += currTime - c.t
    }

    val avgWaitTime = totalTime / customerCount
    println(avgWaitTime)
  }
}


