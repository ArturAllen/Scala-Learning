object Exercises {
	
  def isEven(i: Int): Boolean = {
    return (i % 2) == 0
  }

  def hasEven(l: List[Int]): Boolean = {
    var br = false
    for (i <- l) {
      if (isEven(i)) {
        br = true
      }
    }
    return br
  }

  def luckySum(l: List[Int]): Int = { // 7's are summed twice
    var sum = 0;
    for (i <- l) {
      sum = sum+i
      if (i == 7) {
        sum = sum+i
      }
    }
    return sum
  }

  def isBalanced(l: List[Int]): Boolean = {
    var balanced = false
    for (i <- Range(0, l.length)) {
      if (l.take(i).sum == l.drop(i).sum) {
        balanced = true
      }
    }

    return balanced
  }

  def isPalindrome(str: String): Boolean = {
    return str == str.reverse
  }
  
  def main(args: Array[String]): Unit = {
    val l1 = List(0,1,2,3,4,5,6,7,8,9)
    val l2 = List(1,3,5,7,9)

    println(isPalindrome("Bob"))
  }
}
