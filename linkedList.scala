object Script {
  def main(args: Array[String]): Unit = {


    class Node(val value: Any) {
      var next: Node = Node(null) // Point to the empty Node by default
    }
    val emptyNode = Node(null)

    class LinkedList {
      var head: Node = emptyNode
      var tail: Node = emptyNode

      def append(x: Any): Unit = {
        val item : Node = new Node(x)
        if (isEmpty) { // Empty list
          head = item
          tail = item
        } else {
          tail.next = item // Append to the current tail's next
          tail = item      // Update tail to the newly appended node
        }
      }

      def pop(): Any = {
        if (isEmpty) {
          throw new NoSuchElementException("Cannot pop from an empty list")
        } else {
          var value: Any = head.value
          if (head == tail) { // Only one element
            head = emptyNode
            tail = emptyNode
          } else {
            val newHead = head.next
            head = newHead
          }
          value
        }
      }

      def isEmpty: Boolean = head == null

      //def search(): Int = {} // Implement search functionality later
      //def show(): Unit = {}  // Implement display functionality later
    }

    val lista = new LinkedList()
    lista.append(22)
    lista.append(4)

    println(lista.head) // Output: 22
    println(lista.tail.value) // Output: 4
  }
}
