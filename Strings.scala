object HelloWorld {
  def main(args: Array[String]) : Unit = {
    val name = "Artur"
    val hi = "Hello, World!"
    
    println(s"Hello, ${name}!") // With string interpolation
    println(s"Hello, $name!")   // Curly braces can be ommitted
    printf("A string %s, an integer %d, a float %.2f", "Hello", 42, 3.14) // Just like in C :)
    println("Hello, World!" slice (0,5))  // Returns "Hello"
    
    println(name.charAt(0)) // Returns 'A'
    println(name.indexOf("r")) // Returns 1
    
    println()
  }
}
