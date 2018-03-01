package Funcao_Ordem_Superior

import scala.annotation.tailrec

object Recursion extends App{

  @tailrec
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a
    else gcd(b, a % b)

  def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1)

  def factorialTail(n: Int): Int = {
    def iter(x: Int, result: Int): Int =
      if (x == 1) result
      else iter(x - 1, result * x)
    iter(n, 1)
  }

  //println(factorial(3))
  //println(factorialTail(3))

  /*
  * factorial(3)
  * 3,1
  * 2,3
  * 1,6
  *
  * factorial(4)
  * 4,1
  * 3,4
  * 2,12
  * 1,24
  *
  */

  def fib(n: Int): Int =
    if (n > 1) fib(n - 1) + fib(n - 2)
    else n

  def fibWithTailRec(n: Int): Int =
    if (n > 1) fibIter(1, 1, n - 2)
    else n

  // Function fibIter is not inner for illustrative purpose.
  private def fibIter(prev: Int, current: Int, n: Int): Int =
    if (n == 0) current
    else fibIter(current, prev + current, n - 1)

  println(fib(10000))


  def foldLeft[A, B](seq: Seq[A], z: B)(f: (B, A) => B): B =
    seq match {
      case Nil => z
      case x :: xs => foldLeft(xs, f(z, x))(f)
    }

  def foldRight[A, B](seq: Seq[A], z: B)(f: (A, B) => B): B =
    seq match {
      case Nil => z
      case x :: xs => f(x, foldRight(xs, z)(f))
    }

  def foldRightUsingFoldLeft[A, B](seq: Seq[A], z: B)(f: (A, B) => B): B =
    foldLeft(seq.reverse, z)((b, a) => f(a, b))


}

