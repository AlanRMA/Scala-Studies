object Script {
 def compPair(set: List[Int], qual: Int => Boolean): List[Int] = {
  if (set.isEmpty) {
    List()
  } else{ if (qual(set.head)) {
    compPair(set.tail, qual)
  } else {
    set.head :: compPair(set.tail, qual)
  }}
}
  def qual(n:Int):Boolean ={ if (n%2==0) false else true}

  def main(args: Array[String]): Unit = {
    val a = List(1,2,3,4,5,6,7,8,9)
    val b = List(2, 4, 6, 8,11)
    println(compPair(a,qual))
    println(compPair(b,qual))
  }
}
