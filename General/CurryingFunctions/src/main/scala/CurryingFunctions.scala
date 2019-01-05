

object CurryingFunctions {
  def main(args:Array[String]):Unit = {
      println("----------------------- CurryingFunctions -----------------------")
      println(sum(4)(5))
      println(mul(4)(5))
      println(mul02(4)(5)(6))
      
      println("----------------------- ----------------- -----------------------")
  }
  
  def sum(a:Int)(b:Int) = {
      a + b
  }
  
  def mul(a:Int)=(b:Int)=>{
      a * b
  }
  
  def mul02(a:Int)(b:Int)(c:Int):Int = {a*b*c}
}