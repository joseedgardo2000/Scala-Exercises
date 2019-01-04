

object Loops {
  def main(args:Array[String]):Unit = {
      println("----------- Loops -----------")
      
      whileLoop()
      doWhileLoop()
      
      println("----------- ----- -----------")
  }
  
  def whileLoop():Unit = {
      var i = 0
      
      println("------------ While Loop ------------")
      
      while(i < 5){
          println(s"Value: ${i}")
          i+=1
      }
      
      println("------------ ---------- ------------")   
  }
  
  def doWhileLoop():Unit = {
      var i = 0
      
      println("------------ Do While Loop ------------")
      
      do{
          println(s"Value: ${i}")
          i+=1
      } while(i < 5)
      
      println("------------ ---------- ------------")   
  }
}