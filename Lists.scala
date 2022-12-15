object Lists {
  def main(args: Array[String]): Unit = {
    val l1 = List(1, 3.14, true, (3,4,5))
    val evens = List(0, 2, 4, 6, 8, 10)

    val nested_list = List(List(1,2,3), List(4,5,6))
    
    println(nested_list.head)
    println(nested_list.tail)
    println(evens.drop(2))
    println(evens slice (1, 4))
  }
}
