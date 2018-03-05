package Scala_A_Z

class URL( host: String = "localhost", port: Int = 8080) {
 def connect() = println(s"$host - $port")

}

object Test extends App{
  new URL(port = 7070).connect()
}
