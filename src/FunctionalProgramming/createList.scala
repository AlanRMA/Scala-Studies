import scala.collection.mutable.ListBuffer

object Script {
  def createList(i: BigInt, f: BigInt, p: BigInt): List[BigInt] = {
    val buffer = ListBuffer[BigInt]()
    var current = i
    while (current < f) {
      buffer += current
      current += p
    }
    buffer.toList
  }

  def main(args: Array[String]): Unit = {
    println(createList(0, 10000000, 1)) // 0,1,2,3,4,5,6,7,8,9,...,9999
  }
}
