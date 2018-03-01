package CurryTest

object Curry extends App{

  def curryBinaryOperator[A](operator: (A, A) => A): A => (A => A) = {

    def curry(a: A): A => A = {
      (b: A) => operator(a,b)
    }

    curry
  }

  def add(a: Int, b: Int) = a + b // (Int, Int) => Int
  def multiply(a: Int, b: Int) = a * b // (Int, Int) => Int

  val addCurried = curryBinaryOperator(add) // Int => (Int => Int)
  val multiplyCurried = curryBinaryOperator(multiply) // Int => (Int => Int)

}
