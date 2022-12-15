object Tuples {
  def main(args: Array[String]): Unit = {
    val myTup = (42, 3.14, "Hello", false)
    println(myTup)
    
    println(myTup._3) // Prints "Hello"
  }
}
