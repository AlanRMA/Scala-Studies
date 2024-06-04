object Script {
  def isPalindrome(text: String): Boolean = {
    if (text.length == 0 || text.length == 1 ) { 
        return true}
    if(text(0) == text(text.length - 1)) {
        isPalindrome(text.substring(1, text.length - 1))
    } else {
    return false}
    }
  def main(args: Array[String]): Unit = {
    val t1 = "ovo" // true
    val t2 = "dinosaur"// false
    val t3 = "arara" // true
    println(isPalindrome(t1))
    println(isPalindrome(t2))
    println(isPalindrome(t3))
  }
}