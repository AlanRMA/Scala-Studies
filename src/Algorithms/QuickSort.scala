import scala.util.Random

object QuickSortObject {
  def quickSort(arr: Array[Int]): Array[Int] = {
    // Verifica se o array está vazio ou contém apenas um elemento
    if (arr.length <= 1) return arr

    // Criar um objeto Random
    val random = new Random()
    val randomIndex = random.nextInt(arr.length)
    val p = arr(randomIndex)

    // Criar os arrays left e right
    var left = Array[Int]()
    var right = Array[Int]()


    for (i <- arr.indices if i != randomIndex) {
      if (arr(i) < p) {
        left = left :+ arr(i)
      } else {
        right = right :+ arr(i)
      }
    }

    quickSort(left) ++ Array(p) ++ quickSort(right)
  }

  def main(args: Array[String]): Unit = {
    // Casos de teste
    val testCases = List(
      Array(3, 6, 8, 10, 1, 2, 1),
      Array(5, 3, 8, 4, 2),
      Array(1, 2, 3, 4, 5),
      Array(5, 4, 3, 2, 1),
      Array(1),
      Array(3, -1, 0, 5, 2, -3),
      Array(2, 2, 2, 2, 2)
    )

    for (arr <- testCases) {
      val sortedArr = quickSort(arr)
      println(s"Original array: ${arr.mkString(", ")}")
      println(s"Sorted array: ${sortedArr.mkString(", ")}")
      println()
    }
  }
}
