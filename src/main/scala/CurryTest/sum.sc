def curryBinaryOperator[A](operator: (A, A) => A): A => (A => A) = {

  def curry(a: A): A => A = {
    (b: A) => operator(a,b)
  }

  curry
}