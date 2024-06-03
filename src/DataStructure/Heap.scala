class MaxHeap {
  private var heap: Array[Int] = Array()
  private var size: Int = 0

  // Retorna o índice do pai
  private def parent(index: Int): Int = (index - 1) / 2

  // Retorna o índice do filho à esquerda
  private def leftChild(index: Int): Int = 2 * index + 1

  // Retorna o índice do filho à direita
  private def rightChild(index: Int): Int = 2 * index + 2

  // Adiciona um elemento ao heap
  def insert(element: Int): Unit = {
    if (size == heap.length) {
      heap = heap ++ Array.fill(size + 1)(0)  // Duplica o tamanho do heap
    }
    heap(size) = element
    size += 1
    heapifyUp(size - 1)
  }

  // Remove e retorna o elemento máximo do heap
  def extractMax(): Int = {
    if (size == 0) throw new NoSuchElementException("Heap is empty")
    val max = heap(0)
    heap(0) = heap(size - 1)
    size -= 1
    heapifyDown(0)
    max
  }

  // Mantém a propriedade do heap após a inserção
  private def heapifyUp(index: Int): Unit = {
    var i = index
    while (i > 0 && heap(parent(i)) < heap(i)) {
      swap(i, parent(i))
      i = parent(i)
    }
  }

  // Mantém a propriedade do heap após a extração
  private def heapifyDown(index: Int): Unit = {
    var i = index
    while (leftChild(i) < size) {
      var largest = leftChild(i)
      if (rightChild(i) < size && heap(rightChild(i)) > heap(leftChild(i))) {
        largest = rightChild(i)
      }
      if (heap(i) >= heap(largest)) {
        return
      }
      swap(i, largest)
      i = largest
    }
  }

  // Troca dois elementos do heap
  private def swap(index1: Int, index2: Int): Unit = {
    val temp = heap(index1)
    heap(index1) = heap(index2)
    heap(index2) = temp
  }

  // Verifica se o heap está vazio
  def isEmpty: Boolean = size == 0

  // Retorna o tamanho do heap
  def getSize: Int = size
}

object MaxHeapDemo extends App {
  val heap = new MaxHeap
  heap.insert(3)
  heap.insert(1)
  heap.insert(6)
  heap.insert(5)
  heap.insert(2)
  heap.insert(4)

  println(heap.extractMax())  // 6
  println(heap.extractMax())  // 5
  println(heap.extractMax())  // 4
  println(heap.extractMax())  // 3
  println(heap.extractMax())  // 2
  println(heap.extractMax())  // 1
}
