package CurryTest

object Curry extends App{

  def product(f: Int => Int)(a:Int, b:Int): Int =
    if(a > b) 1
    else f(a) * product(f)(a+1, b)

  //println(product(x => x * x )(3,4))

  def fact(n: Int) = product(x => x)(1, n)

  //println(fact(5))


  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a:Int, b:Int): Int =
    if(a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1 ,b))

  def product2(f: Int => Int)(a:Int, b:Int): Int = mapReduce(f, (x, y) => x*y, 1)(a,b)

  //println(product2(x => x * x )(3,4))

  val t = Curry("Bruno")
  //t.Name = "MOrr"

  val teste =  Curry
  //println(t)
}

case class Curry(Name: String){

  var ll = List(1,2,3)
  var te = "aaaa"

}
