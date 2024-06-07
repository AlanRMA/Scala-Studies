object Script {
  def getDiv(n: Int): Array[Int] = {
    def helper(div: Int, arr: Array[Int]): Array[Int] = {
      if (div == 1) {
        arr :+ 1
      } else {
        if (n % div == 0) {
          helper(div - 1, arr :+ div)
        } else {
          helper(div - 1, arr)
        }
      }
    }
    helper(n, Array())
  }

  def main(args: Array[String]): Unit = {
    val a1 = 12 // 2 * 2 * 3
    val a2 = 56 // 2 * 2 * 2 * 7
    val a3 = 100 // 2 * 5 * 5
    val a4 = 11 // 11
    println(getDiv(a1).mkString(", ")) // 1, 2, 3, 4, 6, 12
    println(getDiv(a2).mkString(", ")) // 1, 2, 4, 7, 8, 14, 28, 56
    println(getDiv(a3).mkString(", ")) // 1, 2, 4, 5, 10, 20, 25, 50, 100
    println(getDiv(a4).mkString(", ")) // 1, 11
  }
}
