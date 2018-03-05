package Scala_A_Z


trait Logging {
  def writeLog(msg: String): Unit
  def format (msg: String): String

  def log(msg: String): Unit = writeLog(format(msg))
}

trait SimpleFormatLogger extends Logging{
  def format (msg: String): String = s"[log] $msg"
}

trait ComplexFormatLogger extends Logging{
  def format (msg: String): String = s"[complex] $msg"
}

trait SimpleLogger extends  Logging {

  def writeLog(msg: String): Unit = println(msg)

}

trait FileLogger extends  Logging {

  def writeLog(msg: String): Unit = println(s"[file] $msg")

}
                                                    //ComplexFormatLogger
object SimpleFormatLogger extends SimpleLogger with SimpleFormatLogger {

  def main(args: Array[String]): Unit = {

    SimpleFormatLogger.log("Olá mundo das traits")
  }

}
