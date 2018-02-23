(x: Int) => x + 1
//Isso é uma abreviação para a definição de classe anônima a seguir:
new Function1[Int, Int] {
  def apply(x: Int): Int = x + 1
}

//Também é possível definir funções com múltiplos parâmetros:
(x: Int, y: Int) => "(" + x + ", " + y + ")"

() => { System.getProperty("user.dir") }


//Há também uma forma muito simples de escrever tipos de funções. Aqui estão os tipos da três funções acima definidas:

Int => Int
(Int, Int) => String
() => String

//Essa sintaxe é uma abreviação para os seguintes tipos:
Function1[Int, Int]
Function2[Int, Int, String]
Function0[String]