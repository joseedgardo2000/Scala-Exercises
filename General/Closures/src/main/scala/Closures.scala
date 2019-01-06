import farscope.ClasA
import farscope.ClasA

object Closures {
  var hi = ""
  var greet = ""
  def main(args:Array[String]):Unit = {
      println("------------------ Closures ------------------")
      closure01()
      closure02()
      println("------------------ -------- ------------------")
      
  }
  //-----------------------------------------------------------
  def closure02():Unit = {
      val cla = new ClasA()
      hi = "Hello"
      greet = "good morning"
      cla.exec(sayHello, "Marry")
      hi = "Hola"
      greet = "buenos dias"
      cla.exec(sayHello, "Maria")
  }
  
  def sayHello(name:String):String = {
      s"${hi} ${name}, ${greet}"
  }
  
  //-----------------------------------------------------------
  def closure01():Unit = {
      val num1 = 10
      val sum = (i:Int)=> i + num1
      println(sum(5))
  }
}