package Funcao_Ordem_Superior

object Summing extends App{

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)

  def sumInts(a: Int, b: Int) = sum (id, a, b)
  def sumCubes(a: Int, b: Int) = sum (cube, a, b)
  def sumFactorials(a: Int, b: Int) = sum (fact, a, b)

  // Utilizando funções anominas, simplicia o codigo
  def sumIntsA(a: Int, b: Int) = sum (x => x, a, b)
  def sumCubesA(a: Int, b: Int) = sum (x => x * x * x, a, b)

  def id(x: Int): Int = x
  def cube(x: Int): Int = x * x * x
  def fact(x: Int): Int = if(x == 0) 1 else fact(x - 1)

  def sum2(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int ={
      if(a > b)acc
      else loop(a + 1, f(a) + acc)
    }
    loop(a, 0)
  }

  println(sum(x => x*x,3,5))
  //println(sum2(x => x*x,3,5))
}
