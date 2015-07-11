// https://www.hackerrank.com/challenges/fp-reverse-a-list

def f(arr: List[Int]): List[Int] = {
  var l: List[Int] = Nil
  var tmpArr = arr
  while (tmpArr.nonEmpty) {
    l = tmpArr.head :: l
    tmpArr = tmpArr.tail
  }
  l
}
