object Script {
  def mdc(a: Int, b: Int): Int = {
  def helper(a: Int, b: Int, acc: Int): Int = {
    if (a == 0) return b
    if (b == 0) return a
    helper(b, a % b, b)
  }
  helper(a, b, b)
}


  def main(args: Array[String]): Unit = {
    println(mdc(4,6)) // 2
    println(mdc(60, 6)) // 6
    println(mdc(200, 140)) // 20
  }
}