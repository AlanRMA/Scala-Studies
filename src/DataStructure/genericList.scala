class GenericList[T] {
  private val itens: IndexedSeq[T] = IndexedSeq()

  def +(item: T): Unit = {
    itens += item
  }

  def remove(indice: Int): Unit = {
    itens.remove(indice)
  }

  def get(indice: Int): T = {
    itens(indice)
  }

  def len: Int = {
    itens.length
  }
}
