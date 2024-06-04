object Script {
  def qPairSum(arr: Array[Int]): Int = {
    //identificar numero par
    if (arr.isEmpty) 0 else {
         if (arr(0) % 2 == 0) {
            arr(0) * arr(0) + qPairSum(arr.drop(1))
    } else {
            qPairSum(arr.drop(1))
    }
  }
  }
  def main(args: Array[String]): Unit = {
    val arr = Array(2, 3, 1, 5, 4, 8)
    println(qPairSum(arr)) // 84
  }
}
