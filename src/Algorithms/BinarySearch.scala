object App {
  def main(args: Array[String]): Unit = {
    val rangeA = 0 to 1000
    BSearch(630, rangeA)
    BSearch(22, rangeA)
    BSearch(142, rangeA)
  }

  def BSearch(target: Int, range: Range): Unit = {
    var result: Option[Int] = None
    var floor = range.start
    var ceiling = range.end

    while (result.isEmpty && floor <= ceiling) {
      var mid = floor + (ceiling - floor) / 2
      if (mid == target) {
        result = Some(target)
      } else if (mid > target) {
        ceiling = mid - 1
      } else {
        floor = mid + 1
      }
    }

    result match {
      case Some(value) => println(s"Target found: $value")
      case None => println("Target not found")
    }
  }
}
