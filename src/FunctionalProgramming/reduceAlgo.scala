object Script {
def reduce(lista: List[Int], funcao: (Int, Int) => Int): Int = {
  if (lista.isEmpty) {
    throw new UnsupportedOperationException("Não é possível reduzir uma lista vazia")
  } else if (lista.length == 1) {
    lista.head
  } else {
    var resultado = lista.head
    for (i <- 1 until lista.length) {
      resultado = funcao(resultado, lista(i))
    }
    resultado
  }
}
def main(args: Array[String]): Unit = {
val numeros = List(1, 2, 3, 4, 5)
val somaTotal = reduce(numeros, (x: Int, y: Int) => x + y)
println(somaTotal) // Saída: 15
  }

}