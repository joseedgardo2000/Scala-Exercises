

object Options {
  def main(args:Array[String]):Unit = {
      println("--------------- Options ---------------")
      f1()
      f2()
      println("--------------- ------- ---------------")
  }
  
  def f2():Unit = {
      println("....... f2() .......")
      val bag = List("1", "2", "foo", "3", "bar")
      println(bag.flatMap(f=>f))
      println(bag.map(f=>f))
      val sum = bag.flatMap(f=>toInt(f)).sum
      println(sum)
  }
  
  def toInt(in:String): Option[Int] = {
      try{
          Some(Integer.parseInt(in))
      } catch {
          case e: NumberFormatException => None
      }
  }
  // ----------------------------------------------------
  def f1():Unit = {
      println("....... f1() .......")
      val capitals:Map[String, String] = 
          Map(
                  "Mexico"->"Mexico City",
                  "France"->"Paris",
                  "Italy"->"Roma",
                  "Japan"->"Tokyo",
                  "Vietnam"->"Hanoi"
             )
      val capital01 = capitals.get("Italy")
      val capital02 = capitals.get("England")
      println(capital01)
      println(capital02)
      println(sCapital(capital01))
      println(sCapital(capital02))
      println(capital01.getOrElse("No Country-Capital"))
      println(capital02.getOrElse("No Country-Capital"))
  }
  
  def sCapital(c:Option[String]):String = {
      c match {
          case Some(s) => s
          case None => "-"
      }
  }
}