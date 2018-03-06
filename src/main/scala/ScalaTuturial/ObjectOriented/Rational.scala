package ScalaTuturial.ObjectOriented

class Rational(x: Int, y: Int) {
  //Require é usado para impor uma condição prévia ao chamador de uma função.
  //Assert é usado para verificar o código da própria função.
  require(y > 0, "denominator must be positive")
  assert(x >= 0)

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def numer: Int = x
  def denom: Int = y

  //Pode ser uma vantagem se for passar para VAL se for para ser usado com frequencia pois seram computados apenas uma vez:
  val numer222 = x / gcd(x, y)
  val denom222 = y /gcd(x, y)


  def less(that: Rational) =
    numer * that.denom < that.numer * denom

  def less2(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) =
    if (this.less(that)) that else this


  def + (r: Rational) =
    new Rational(
      numer * r.denom + r.numer * denom,
      denom * r.denom
    )
  def - (r: Rational) = new Rational(
    numer * r.denom - r.numer * denom,
    denom * r.denom
  )
  def * (r: Rational) = new Rational(
    numer * r.denom * r.numer * denom,
    denom * r.denom
  )
}

object Rational extends  App{

  /* Implementar a função aritimetica

  n1 / d1 + n2 / d2 = (n1 * d2 + n2 * d1) / (d1 * d2)
  n1 / d1 - n2 / d2 = (n1 * d2 - n2 * d1) / (d1 * d2)
  n1 / d1 * n2 / d2 = (n1 * n2) / (d1 * d2)
  n1 / d1 / n2 / d2 = (n1 * d2) / (d1 * n2)
  n1 / d1 = n2 / d2 iff n1 * d2 = d1 * n2

  */
  def addRational(r: Rational, s: Rational): Rational =
    new Rational(
      r.numer * s.denom + s.numer * r.denom,
      r.denom * s.denom
    )

  def makeString(r: Rational) =
    r.numer + "/" + r.denom


  val x =  makeString(addRational(new Rational(1, 2), new Rational(2, 3)))

  println(x)
  println(new Rational(1))
  val x1= new Rational(1, 2)
  val y2= new Rational(1, 3)
  x1 * x1 + y2 * y2


}


