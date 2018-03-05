package Scala_A_Z

//caso acrecente um val a um parametro do construtor ele passa a ser um atributo ca classe "Somente no contrutor"
class Pessoa(val nome: String, var idade: Int){
  //construtores auxiliares
  def this (nome: String, sobrenome: String, idade: Int) = this(nome + " " +sobrenome, idade)
  def this() = this("", 0)

}

object TestePessoa extends App{
  val p = new Pessoa("Bruno", 24)
  //Não é uma sobrescrita direta, exite uma proteção ao encapsulamento, ela chama o set e o get da idade
  p.idade = 12
  println(" nome = "+ p.nome)
  val p2 = new Pessoa("Bruno", "Costa", 24)
  val p3 = new Pessoa()

}
