object Functions {
  def greet(name: String): Unit = {
    println(s"Hello $name")
  }

  def adder(a: Int, b: Int): Int = {
    return a+b
  }

  def squareList(l: List[Int]): List[Int] = {
    return l.map(i => i*i)
  }
  
  def main(args: Array[String]): Unit = {
    greet("Bjarne")

    println(adder(2, 3))

    println(squareList(List(1,2,3,4)))
  }
}
