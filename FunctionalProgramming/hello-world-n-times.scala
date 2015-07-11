// https://www.hackerrank.com/challenges/fp-hello-world-n-times

def f(count: Int) = {
  var c = count
  while (c > 0) {
    c -= 1
    println("Hello World")
  }
}
