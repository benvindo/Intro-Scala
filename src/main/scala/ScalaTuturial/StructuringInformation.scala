package ScalaTuturial

object StructuringInformation {


  case class Note(name: NoteName, duration: String, octave: Int)

  val c3 = Note(G, "Quarter", 3)

  sealed trait Symbol
  case class Note2(name: String, duration: String, octave: Int) extends Symbol
  case class Rest(duration: String) extends Symbol

  val symbol: Symbol = Note2("C", "Quarter", 3)
  val symbol2: Symbol = Rest("Whole")

  def symbolDuration(symbol: Symbol): String =
    symbol match {
      case Note2(name, duration, octave) => duration
      case Rest(duration) => duration
    }

  /*def unexhaustive(): Unit = {
    sealed trait Symbol
    case class Note(name: String, duration: String, octave: Int) extends Symbol
    case class Rest(duration: String) extends Symbol

    def nonExhaustiveDuration(symbol: Symbol): String =
      symbol match {
        case Rest(duration) => duration
      }
  }*/


  sealed trait NoteName
  case object A extends NoteName
  case object B extends NoteName
  case object C extends NoteName
  case object D extends NoteName
  case object E extends NoteName
  case object G extends NoteName

}
