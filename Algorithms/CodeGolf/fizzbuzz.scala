// https://www.hackerrank.com/challenges/fizzbuzz

object Solution {
    def p(x: Any) = println(x)
    
    def main(args: Array[String]) {
        for(i<-1 to 100){
            if(i%15==0) p("FizzBuzz")
            else if(i%3==0) p("Fizz")
            else if(i%5==0) p("Buzz")
            else p(i)
        }
    }
}

