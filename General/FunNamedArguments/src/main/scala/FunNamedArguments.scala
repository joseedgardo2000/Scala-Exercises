

object FunNamedArguments {
  def main(args:Array[String]):Unit = {
      printNameNumber("cinco", 5)
      printNameNumber(number=6, name="seis")
      printNameNumber(name="siete", number=7)
  }
  
  def printNameNumber(name:String, number:Int):Unit = {
      println(s"${name} = ${number}")
  }
}