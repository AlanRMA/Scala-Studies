object Script {
  def factor(n: Int): Array[Int] = {
    def helper(n: Int, f: Int, factors: List[Int]): List[Int] = {
      if (f * f > n) {
        if (n > 1) n :: factors else factors
      } else if (n % f == 0) {
        helper(n / f, f, f :: factors)
      } else {
        helper(n, f + 1, factors)
      }
    }
    
    helper(n, 2, List()).reverse.toArray
  }

  def main(args: Array[String]): Unit = {
    val a1 = 12 // 2 * 2 * 3
    val a2 = 56 // 2 * 2 * 2 * 2 * 7
    val a3 = 100// 2 * 5 * 5
    val a4 = 11 // 11

    println(factor(a1).sameElements(Array(2, 2, 3)))
    println(factor(a2).sameElements(Array(2, 2, 2, 7)))
    println(factor(a3).sameElements(Array(2, 2, 5, 5)))
    println(factor(a4).sameElements(Array(11)))
  }
}
