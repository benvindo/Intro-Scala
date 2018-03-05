package CurryTest

object Curry extends App{

  def product(f: Int => Int)(a:Int, b:Int): Int =
    if(a > b) 1
    else f(a) * product(f)(a+1, b)

  println(product(x => x *x)(3,4))

  def fact(n: Int) = product(x => x)(1, n)

  println(fact(12))

}
