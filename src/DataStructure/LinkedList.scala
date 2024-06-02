sealed trait LinkedList[A] {
  def head: Option[A]
  def tail: LinkedList[A]
  def isEmpty: Boolean = head.isEmpty
  def size: Int = {
    @scala.annotation.tailrec
    def count(node: LinkedList[A], acc: Int): Int = node match {
      case EmptyList => acc
      case Node(h, t) => count(t, acc + 1)
    }
    count(this, 0)
  }
  def apply(index: Int): Option[A] = {
    @scala.annotation.tailrec
    def get(node: LinkedList[A], i: Int): Option[A] = (node, i) match {
      case (EmptyList, _) => None
      case (Node(h, t), 0) => Some(h)
      case (Node(_, t), i) if i > 0 => get(t, i - 1)
      case _ => throw new IndexOutOfBoundsException("Index out of bounds")
    }
    get(this, index)
  }
  def prepend(element: A): LinkedList[A] = Node(element, this)
  def append(element: A): LinkedList[A] = this match {
    case EmptyList => Node(element, EmptyList)
    case Node(h, t) => t.append(element).prepend(h)
  }
}

case object EmptyList extends LinkedList[Nothing] {
  override def head: Option[Nothing] = None
  override def tail: LinkedList[Nothing] = this
}

case class Node[A](head: A, tail: LinkedList[A]) extends LinkedList[