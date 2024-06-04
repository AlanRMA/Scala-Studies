object Script {
  def loop(n:Int): Unit = {
    for(i <- 1 to n) {
        println(i)
  }
  }
  def recLoop(n:Int): Unit = {
    if (n == 1) println(n)
    else{
        recLoop(n-1)
        println(n)
        
    }
  }
  def whileLoop(n:Int): Unit = {
    var w = n
    while(w > 0){
        println(w)
        w -= 1
    }
  }
  def recWhileLoop(n:Int): Unit = {
    if (n > 0){
        println(n)
        recWhileLoop(n-1)
    }
  }
  def main(args: Array[String]): Unit = {
    println(loop(5))
    println("-----")
    println(recLoop(5))
    println("-----")
    println(whileLoop(5))
    println("-----")
    println(recWhileLoop(5))
  }
}
