object Script {
 def selectDigits(input: String): String = {
    val filtered : String = filterDigits(input)
    val converted : Array[Int] = convertDigits(filtered)
    return converted.mkString
 }
 def filterDigits(str: String): String = {
        return str.filter(_.isDigit)
 }
 def convertDigits(str: String): Array[Int] = {
        return str.map(_.asDigit).toArray
 }

  def main(args: Array[String]): Unit = {
    val input1 = "abc123"
    val input2 = "abc"
    val input3 = "123"
    val input4 = "Hell1o Wor22ld 3413x"
    println(selectDigits(input1))
    println(selectDigits(input2))
    println(selectDigits(input3))
    println(selectDigits(input4))
  }
}
