import scala.math._
object Script {
def logBase(base: Int, x: Int): Double = log(x) / log(base)
  def main(args: Array[String]): Unit = {
    val log = log10(100)
    val log3_81 = logBase(3,81)
    println(log)
    println(log3_81)
  }
}