class Point(xc: Int, yc: Int) extends Similaridade {
  var x: Int = xc
  var y: Int = yc
  def eSemelhante(obj: Any) =
    obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x
}
object TraitsTest extends App {
  val p1 = new Point(2, 3)
  val p2 = new Point(2, 4)
  val p3 = new Point(3, 3)
  val p4 = new Point(2, 3)
  println(p1.eSemelhante(p2))
  println(p1.eSemelhante(p3))
  // Ponto.naoESemelhante foi definido na classe Similaridade
  println(p1.naoESemelhante(2))
  println(p1.naoESemelhante(p4))
}