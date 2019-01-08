

object PatternMatching {
  def main(args:Array[String]):Unit = {
      println("--------------------- PatternMatching ---------------------")
      f1()
      f2()
      f3()
      println("--------------------- --------------- ---------------------")
  }
  
  //-----------------------------
  def f1():Unit = {
      println("........ f1() ........")
      println(mc1(1))
      println(mc1(2))
      println(mc1(3))
  }
  
  def mc1(x:Int):String = 
      x match{
      case 1 => "uno"
      case 2 => "dos"
      case _ => "cualquiera"    
  }
  //-----------------------------
  def f2():Unit = {
      println("........ f2() ........")
      println(mc2(1))
      println(mc2("dos"))
      println(mc2(3))
      println(mc2("ñ"))
  }
  
  def mc2(x:Any):Any = {
      x match {
          case 1 => "Uno"
          case "dos" => 2 
          case y:Int => "is a Integer"
          case _ => "cualquiera"
      }
  }
  //-----------------------------
  def f3():Unit = {
      println("........ f3() ........")
      val l = List(Person("Pedro",30), Person("Marta", 25), Person("Franco", 12))
      l.foreach(p=>println(mc3(p)))
  }
  
  def mc3(x:Person):String = x match {
      case Person("Pedro", 30) => s"Hi!!!! Pedro"
      case Person("Marta", age) => s"Hi!!!! Marta, you are ${age} years old"
      case Person(name, age) => s"Hi!!!! ${name}, you are ${age} years old"
  }
  
  
  
  case class Person(name:String, age:Int)
}