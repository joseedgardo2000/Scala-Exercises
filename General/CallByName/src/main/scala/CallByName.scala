

object CallByName {
  
  def printx(a:String):String = {
      println(s"x: ${a}")
      s"returned x: ${a}"
  }
  
  def printy():String = {
      println("y: any value")
      "returned y: any value"
  }
  
  def printz() {
      println("z: no value")
  }
  
  def main(args:Array[String]):Unit = {
      val f1:(String)=>String = printx 
      val f2: ()=> String = printy _
      val f3 = printz _
      val f4: () => Unit = printz _
      
      println(f1("mensaje"))
      println(f2())
      f4()
      delayed(time());
      delayed(123)
      
      delayed2(time());
      delayed2(123)
  }
  
  def time() = {
      println("Getting time in nano seconds")
      System.nanoTime
  }
  
  def delayed( t: => Long ) = {
      println("In delayed method")
      println("Param: " + t)
  }
  
  def delayed2( t:Long ) = {
      println("In delayed method")
      println("Param: " + t)
  }
}