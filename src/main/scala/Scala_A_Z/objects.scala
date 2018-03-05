package Scala_A_Z

// objeto singleton, "ao mesmo tempo uma classe" quando for usar o obejeto so utilizarar o nome Util, não precisará instanciar esse cara
// os objetos singleton  do scala  já considera a programação concorrente
// objeto normal
object Util {
  val PI = 3.14
}


object Teste extends App{
  println(Util.PI)
  println(new Math().xPI(2))
}

//object companion
object Math{
  val PI = 3.14
}
class  Math {
  def xPI(x: Int) = x * Math.PI
}