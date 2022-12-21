object ForLoops {
  def main(args: Array[String]): Unit = {
    for (num <- Range(0,10)){
      if (num%2 == 0) {
        println(s"$num is even")
      }
      else {
        println(s"$num is odd")
      }
    }

    val names = List("John", "Abe", "Cindy", "Cat")

    for (name <- names) {
      if (name.startsWith("C")) {
        println(s"$name starts with C")
      }
    }
  }
}
