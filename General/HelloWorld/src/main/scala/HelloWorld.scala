import java.nio.charset.Charset


object HelloWorld {
  def main(args:Array[String]):Unit = {
    println("\033[H\033[2J");
    println("---------- HelloWorld.scala ----------\n")
    println("Hello World!!!!")
    println("¡¡¡ Hola Mundo !!!")
    println("Charset: " + Charset.defaultCharset())
    println("\n---------- HelloWorld.scala ----------")
  }
}