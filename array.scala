object Arrays {
  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,3)
    val r1  = Array.range(0,10)
    val r2  = Array.range(0,10,2)
 
    for (i <- r2) {
      println(i)
    }
  }
}
