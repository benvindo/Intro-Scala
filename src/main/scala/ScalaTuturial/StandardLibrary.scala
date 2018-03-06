package ScalaTuturial

import scala.util.{Failure, Success, Try}

object StandardLibrary extends  App {

    val cond: (Int, Int) => Boolean = (x,y) =>  x < y

  def insert(x: Int, xs: List[Int]): List[Int] =
    xs match {
      case List() => x :: Nil

      case y :: ys =>
        if (cond(x, y)) x :: y :: ys
        else y :: insert(x, ys)
    }


  def insertionSort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, insertionSort(ys))
  }


  //println(insert(3, List(9,5,7,2,1,6)))
  //println(insertionSort(List(9,5,7,2,1,6)))
  println(insert(2, 1 :: 3 :: Nil))
  println(insert(1, 2 :: 3 :: Nil))
  println(insert(3, 1 :: 2 :: Nil))
  println(insert(3, 1 :: 2 :: Nil))

  println(foo(-10))

  def sqrt(x: Double): Option[Double] =
    if (x < 0) None else Some(x)

  def foo(x: Double): String =
    sqrt(x) match {
      case None => "no result"
      case Some(y) => y.toString
    }

  def sqrt2(x: Double): Try[Double] =
    if (x < 0) Failure(new IllegalArgumentException("x must be positive"))
    else Success(x)

  val t = Right(1).filterOrElse(x => x % 2 == 0, "Odd value")
  val t2 = Left("foo").map((x: Int) => x + 1)
  val t3 =Right(1).map((x: Int) => x + 1)
  println(t)
  println(t2)
  println(t3)

  def triple(x: Int): Int = 3 * x

  def tripleEither(x: Either[String, Int]): Either[String, Int] =
    x.right.map(triple)

  tripleEither(Right(1))

  tripleEither(Left("not a number"))

  def myFct(bindings: Int*) = {

  }

}
