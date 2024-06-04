object Script {
  def addPairs(arr: Array[Int]): Int = {
    if (arr.isEmpty) 0 // Retorna 0 se o array estiver vazio
    else if (arr(0) % 2 == 0) arr(0) + addPairs(arr.drop(1)) // Soma o par atual e recursa
    else addPairs(arr.drop(1)) // Ignora o ímpar atual e recursa
}
  def main(args: Array[String]): Unit = {
    val arr = Array(2, 3, 1, 5, 4)
    val result = addPairs(arr)
    println(result)
  }
}
