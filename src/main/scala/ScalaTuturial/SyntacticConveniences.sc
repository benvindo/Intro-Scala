/* Interpolação de Strings */
def greet(name: String): String =
  s"Hello, $name!"

greet("Scala")
greet("Functional Programming")

def greet2(name: String): String =
s"Hello, ${name.toUpperCase}!"

greet2("Scala")


/* Tuplas  */

def pair(i: Int, s: String): (Int, String) = (i, s)

pair(42, "foo")
pair(0, "bar")

val is: (Int, String) = (42, "foo")

//Manipulando a tupla
is match {
  case (i, s) =>
    i
    s
}

// pode ser reescrita assim
val (i, s) = is
i + " aaa"
s + " bbb"

//pegando os elemtentos
is._1
is._2



/* Expansão de valores da função */

//função anonima
(x: Int) => x * x

// expandindo
{
  class AnonFun extends Function1[Int, Int] {
    def apply(x: Int) = x * x
  }
  new AnonFun
}

//menor usando a syntax da classe anomina
new Function1[Int, Int] {
  def apply(x: Int) = x * x
}

/* Expansão da chamadas da função */

//Chamada da função
val f = (x: Int) => x * x

f(7)

//seria a mesma coisa que
val f2 = new Function1[Int, Int] {
  def apply(x: Int) = x * x
}
f2.apply(7)

/* Funções e metodos */


//Scala suporta xyntax de dedicada para expressoes
val xs = List(1,2,3,4,5,6,7,8)
val ys = List(1,2,3,4)


xs.map(x => x + 1)
//voce pode escrever a função acima om esta sintax:
for (x <- xs) yield x + 1

xs.filter(x => x % 2 == 0)
//voce pode escrever a função acima om esta sintax:
for (x <- xs if x % 2 == 0) yield x

// os benificios desta sintax é mais aparente quando ele é combinada
for (x <- xs if x % 2 == 0) yield x + 1

// o exemplo acima equivale:
xs.filter(x => x % 2 == 0).map(x => x + 1)


xs.flatMap(x => ys.map(y => (x, y)))
//voce pode escrever a função acima om esta sintax:
for (x <- xs; y <- ys) yield (x, y)

//Exemplo com filter, flatMap e map com a syntax sugar
for {
  x <- xs if x % 2 == 0
  y <- ys
} yield (x, y)


// O codigo acima se equivale há esse sem a syntax sugar
xs.filter { x =>
  x % 2 == 0
}.flatMap { x =>
  ys.map { y =>
    (x, y)
  }
}


/* Parametros nomeados e Paramentros Padrão */

case class Range(start: Int, end: Int, step: Int = 1)

val xs2 = Range(start = 1, end = 10)

xs2.step

type Result = Either[String, (Int, Int)]

def divide(dividend: Int, divisor: Int): Result =
  if (divisor == 0) Left("Division by zero")
  else Right((dividend / divisor, dividend % divisor))