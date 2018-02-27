package ForComprehensions

object ComprehensionTest1 extends App {
  def par(de: Int, ate: Int): List[Int] =
    for (i <- List.range(de, ate) if i % 2 == 0) yield i
  Console.println(par(0, 20))
}