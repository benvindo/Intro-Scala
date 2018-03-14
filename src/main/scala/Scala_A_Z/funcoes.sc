

object saz3{
  def ehPar(x: Int): Boolean = {
    x % 2 == 0
  }

  //Otimizando, scala infere o retorno na função
  def ehPar2(x: Int)= x % 2 == 0f

  val numeros = List(1,2,3,4,5)
  numeros.filter(ehPar2)

  val nome = "Bruno"
  val sobrenome = "Costa"

  //não precisa dos parenteses, daria no 'mesmo' colocando o val
  def nomeCompleto = nome + " " + sobrenome

  nomeCompleto

}

//var x = List(1,2,3)
var y = scala.collection.mutable.ArrayBuffer.empty[Int]
//x.add(4)


