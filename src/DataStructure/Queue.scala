object App {

  def main(args: Array[String]): Unit = {
    var n = Queue(List(Node(1)))
    println(n.size)
    println(n.isEmpty)
    n = n.enqueue(Node(3))
    println(n.size)

  }

  class Node (x: Int) {
    val value = this.x
  }

  class Queue (nodes: List[Node]) {
    val queue : List[Node] = this.nodes
    def enqueue(newElement : Node): Queue ={
        return new Queue(queue :+ newElement)
        
    }
    def dequeue(): (Node,Queue) = {
        return (this.queue(0),Queue(this.queue.drop(0)))

    }
    def isEmpty : Boolean = if(this.size == 0) return true else false

    def size: Int = nodes.length


  }
}
