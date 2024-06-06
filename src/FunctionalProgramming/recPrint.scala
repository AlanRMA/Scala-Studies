object Script {
  def recPrint(n: Int):Unit = {
    def helper(acc: Int):Unit = {
        if (n == acc) {
            println("hi")
    }   else {
            println("hi")
            helper( acc + 1)
    }
  }
  helper(1)
  }

  def main(args: Array[String]): Unit = {
    val n = 5
    recPrint(n)
  }
}
