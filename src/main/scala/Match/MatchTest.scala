package Match

object MatchTest extends App {
  def matchTest(x: Any): Any = x match {
    case 1 => "um"
    case "dois" => 2
    case y: Int => "scala.Int"
  }
  println(matchTest(5))
}