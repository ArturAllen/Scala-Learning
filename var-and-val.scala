object HelloWorld {
  def main(args: Array[String]) : Unit = {
    var variable = 5
    variable = 3       // Var supports reassignment

    val value = 3      // Val do not

    println(variable)
    println(value)
  }
}
