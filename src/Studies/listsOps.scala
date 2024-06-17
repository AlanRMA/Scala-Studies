object Script {
  def hasItem(list: List[Any], item: Any): Boolean = {
    if list.contains(item) then true else false
  }
  def sliceList(list: List[Any], start: Int, end: Int): List[Any] = {
    return list.slice(start, end)
  }
  def reverseList(list: List[Any]): List[Any] = {
    return list.reverse
  }
  def findbyIndexOnList(list: List[Any], index: Int): Any = {
    return list(index)
  }
  def addItem(list: List[Any], item: Any): List[Any] = {
    return list :+ item
  }
  def removeItem(list: List[Any], item: Any): List[Any] = {
    return list.filter(_ != item)
  }
  def insertItem(list: List[Any], item: Any, index: Int): List[Any] = {
    return list.patch(index, Seq(item), 0)
  }

  def main(args: Array[String]): Unit = {
    println(hasItem(List(1, 2, 3, 4, 5), 3)) // true
    println(hasItem(List(1, 2, 3, 4, 5), 6)) // false
    println(sliceList(List(1, 2, 3, 4, 5), 1, 4)) // [2, 3, 4]
    println(reverseList(List(1, 2, 3, 4, 5))) // [5, 4, 3, 2, 1]
    println(findbyIndexOnList(List(1, 2, 3, 4, 5), 2)) // 3
    println(addItem(List(1, 2, 3, 4, 5), 6)) // [1, 2, 3, 4, 5, 6]
    println(removeItem(List(1, 2, 3, 4, 5), 3)) // [1, 2, 4, 5]
    println(insertItem(List(1, 2, 3, 4, 5), 6, 2)) // [1, 2, 6, 3, 4, 5]

}
}