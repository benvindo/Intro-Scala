package ScalaTuturial

object LexicalScopes {
  def main(args: Array[String]) = println("hello world!")

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2

    def isGoodEnough(guess: Double, x: Double) =
      Math.abs(square(guess) - x) < 0.001

    sqrtIter(1.0, x)
  }

  def square(x: Double) = x * x

  println(sqrt(9))

  // Elimimando a redundancia de x
  def sqrt2(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def improve(guess: Double) =
      (guess + x / guess) / 2

    def isGoodEnough(guess: Double) =
      Math.abs(square(guess) - x) < 0.001

    sqrtIter(1.0)
  }


}
