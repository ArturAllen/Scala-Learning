object Sets {
  def main(args: Array[String]): Unit = {
    val imset = Set(1,1,1,1,1,2,2,2,2,2,3,3,3,3,3) // Immutable set
    val mset = collection.mutable.Set(1,2,3,3,3)   // Mutable set
    																							 // Sets do not hold duplicate values
    																							 // Sets do not necessairily keep the order
    mset += 4
    mset.add(5)

    println(mset)

    println(imset.min)
    println(imset.max)

    println(List(2,2,2,4,4,6,8,8,8,8,8,8,10,10,10).toSet)
  }
}
