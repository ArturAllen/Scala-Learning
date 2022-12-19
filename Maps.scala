object Maps {
  def main(args: Array[String]): Unit = {
    val myMap = Map(("a",1), ("b",2), ("c", 4))
    println(myMap("a"))

    println(myMap get "b") // Returns Some(2)
    println(myMap get "d") // Returns None    This is similar to Maybe, in Haskell

    val mutMap = collection.mutable.Map(("x",1), ("y",2), ("z",3))
    mutMap += ("newKey" -> 7)
    println(mutMap("newKey"))

    println(mutMap.keys)
    println(mutMap.values)
  }
}
