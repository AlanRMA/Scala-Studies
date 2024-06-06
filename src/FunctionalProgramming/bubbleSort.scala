object BubbleSort {

  // Function to swap two elements in a list
  def swap[A](list: List[A], i: Int, j: Int): List[A] = {
    val temp = list(i)
    list.updated(i, list(j)).updated(j, temp)
  }

  // Function to check if a list is sorted (ascending)
  def isSorted[A](list: List[A])(implicit ord: Ordering[A]): Boolean = {
    list.sliding(2).forall(pair => pair.head <= pair.tail.headOption.getOrElse(true))
  }

  // Recursive bubble sort implementation
  def sort[A](list: List[A])(implicit ord: Ordering[A]): List[A] = {
    if (isSorted(list)) list
    else sort(swap(list, 0, 1) ++ list.drop(2))
  }

  def main(args: Array[String]): Unit = {
    val a1 = List(1, 5, 3, 4, 2)
    val a2 = List(3, 2, 1, 0)
    val a3 = List(9, 3, 4, 6, 5, 8, 0, 6, 2, 1)
    val a4 = List(1)

    println(sort(a1))
    println(sort(a2))
    println(sort(a3))
    println(sort(a4))
  }
}
