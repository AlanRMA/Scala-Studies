object Script {
  def findSubstring(str: String, substr: String): Boolean = {
    str.contains(substr)
    return true
  }
  def sliceString(str: String, start: Int, end: Int): String = {
    val newstr = str.slice(start, end)
    return newstr
  }
  def reverseString(str: String): String = {
    val newstr = str.reverse
    return newstr
  }
  def findbyIndexOnString(str: String, index: Int): Char = {
    return str(index)
  }
  def fixCap(str: String): Any = {
        val newstr = str.toLowerCase()
        return newstr.split(" ").map(word=>word.capitalize).mkString(" ")
   
  }


  def main(args: Array[String]): Unit = {
    println(findSubstring("Hello my World!","My"))
    println(sliceString("Hello World!", 0, 5))
    println(reverseString("Hello World"))
    println(findbyIndexOnString("Hello World", 6))
    println(fixCap("heLLo wOrld"))
  }
}