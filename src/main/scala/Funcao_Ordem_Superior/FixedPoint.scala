package Funcao_Ordem_Superior

object FixedPoint extends App{

  val tolerance = 0.0001

  def isCloseEnough(x: Double, y:Double) =
    Math.abs((x-y) / x) / x < tolerance

  def fixedPoint(f: Double => Double)(firstGuess: Double) ={
    def iterate (guess: Double): Double = {
      val next = f(guess)
      if(isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }

  //private val x = 100;
 // println(FixedPoint(5) == FixedPoint(5))
  //val f = FixedPoint()
  //val tt = new FixedPoint(5)
 // val time = FixedPoint(5)
  //tt.y
  //println(f.x)

  var time  = FixedPoint(9,45)

}

case class FixedPoint(x: Int,y: Int) {


  //println(FixedPoint.x)
}