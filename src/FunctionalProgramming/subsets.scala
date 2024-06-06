object Script {

   def getSubsets(arr: List[Int]): List[List[Int]] = {
    def subsetsHelper(arr: List[Int], n: Int): List[List[Int]] = {
      if (n == 0) {
        List(List())
      } else {
        val subsetsWithoutLast = subsetsHelper(arr, n - 1)
        val subsetsWithLast = subsetsWithoutLast.map(subset => subset :+ arr(n - 1))
        subsetsWithoutLast ++ subsetsWithLast
      }
    }

    subsetsHelper(arr, arr.length)
  }
    def getBitmaskList(n: Int): List[String] = {
    (0 until (1 << n)).map { i =>
      val binaryStr = i.toBinaryString
      val paddedBinaryStr = "0" * (n - binaryStr.length) + binaryStr
      paddedBinaryStr
    }.toList
  }

    def translateBitmask(bitmask: String, arr: List[Int]): List[Int] = {
    @annotation.tailrec
    def translate(bitmask: String, arr: List[Int], index: Int, subset: List[Int]): List[Int] = {
      (bitmask, arr) match {
        case ("", _) | (_, Nil) => subset
        case (bm, head :: tail) =>
          val newSubset = if (bm.head == '1') head :: subset else subset
          translate(bm.tail, tail, index + 1, newSubset)
      }
    }
    translate(bitmask, arr, 0, Nil).reverse
  }

    def main(args: Array[String]): Unit = {
        val a1 = List(1, 5, 3, 4, 2)
        val a2 = List(3, 2, 1, 0)
        val a3 = List(9, 3, 4, 6, 5, 8, 0, 6, 2, 1)
        val a4 = List(1)
        val bitmask = getSubsets(a3)
        println(bitmask)
    // println(getSubsets(a1))
    // println(getSubsets(a2))
    // println(getSubsets(a3))
    // println(getSubsets(a4))
  }
}
