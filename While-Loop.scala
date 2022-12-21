import util.control.Breaks._

object WhileLoop {
  def main(args: Array[String]): Unit = {
    var x = 0

    while (x < 5) {
      println(s"x is currently $x")
      println("x is still less than 5, adding 1 to x")
      x = x+1
    }

    println("")
    
    var y = 0

    while (true) {
      if (y == 5) break

      println(s"y is currently $y")
      println("y is still less than 5, adding 1 to y")
      y = y+1
    }
  }
}
