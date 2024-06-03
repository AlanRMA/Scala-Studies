object App {

  def main(args: Array[String]): Unit = {
    val t = new Stack[Any]()  // Use `new` para instanciar a classe Stack
    t.push(2)
    t.push("Bear")
    t.push("Dino")
    println(t.pop())  // Deve imprimir Some(Dino) 
    println(t.pop())  // Deve imprimir Some(Bear)
    println(t.pop())  // Deve imprimir Some(2)
  }

  class Node[T](val x: T, var next: Option[Node[T]] = None)

  class Stack[T] {
    var head: Option[Node[T]] = None

    def push(value: T): Unit = {
      val newNode = Node(value, head)
      head = Some(newNode)
    }

    def pop(): Option[T] = {
      head match {
        case Some(node) =>
          head = node.next
          Some(node.x)
        case None =>
          None
      }
    }
  }
}
