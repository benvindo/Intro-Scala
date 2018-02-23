
class Ponto(var x: Int, var y: Int) {
  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }
  override def toString: String =
    "(" + x + ", " + y + ")"
}

object Classes {
  def main(args: Array[String]) {
    val pt = new Ponto(1, 2)
    println(pt)
    pt.move(10, 10)
    println(pt)
  }
}
