package ScalaTuturial

object HigherOrderFunctions extends App {

  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0
    else a + sumInts(a + 1, b)

  //1 + (1+1, 3) =: 2,3
  //2 + (2+1, 3) = 3,3
  //3 + (3+1, 3) = 4,3
  //println(sumInts(1,10000))
  //println(sumInts(1,5))

  def cube(x: Int): Int = x * x * x

  def sumCubes(a: Int, b: Int): Int =
    if (a > b) 0
    else cube(a) + sumCubes(a + 1, b)

  def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1)

  def sumFactorials(a: Int, b: Int): Int =
    if (a > b) 0
    else factorial(a) + sumFactorials(a + 1, b)





  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)

  def id(x: Int): Int = x
  def sumInts2(a: Int, b: Int) = sum(id, a, b)
  def sumCubes2(a: Int, b: Int) = sum(cube, a, b)
  def sumFactorials2(a: Int, b: Int) = sum(factorial, a, b)

  println(sum(Int => Int * Int * Int,1,3))

  def sum3(f: Int => Int, a: Int, b: Int): Int = {
    def loop(x: Int, acc: Int): Int = {
      if (x > b) acc
      else loop(x + 1, acc + f(x))
    }
    loop(a,0)
  }

  println(sum3(x => x, 1, 5))

}


