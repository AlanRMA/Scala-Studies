object Script {
  def oddList(n: Int, m: Int): Array[Int] = {
    def helper(n: Int, m: Int, arr: Array[Int]): Array[Int] = {
      if (n > m) {
        arr
      } else {
        if (n % 2 == 1) {
          helper(n + 1, m, arr :+ n)
        } else {
          helper(n + 1, m, arr)
        }
      }
    }
    helper(n, m, Array.empty[Int])
  }
  
  def mapSquare(arr: Array[Int]): Array[Int] = {
    arr.map(x => x * x)
  }
  
  def getOddsAndSquares(n: Int, m: Int): Array[Int] = {
    val oddNumbers = oddList(n, m)
    mapSquare(oddNumbers)
  }
  
  def main(args: Array[String]): Unit = {
    val n = 1
    val m = 10
    val squaredOddNumbers = getOddsAndSquares(n, m)
    println(squaredOddNumbers.mkString(", "))
  }
}
