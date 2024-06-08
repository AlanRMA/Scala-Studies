object Script {
 def compose(arr:Array[Int],fx: (Int => Int)):Array[Int] = {
    return arr.map(fx)
}
  def func(x: Int): Int = {x * 2 + 1}

  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 5)
    val arr2 = Array(2,4,8,10,12)
    println(compose(arr, func).mkString(", "))
    println(compose(arr2, func).mkString(", "))
  }
}
