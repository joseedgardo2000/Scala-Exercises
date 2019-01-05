

object FunAsVal {
  def main(args:Array[String]):Unit = {
      println("---------------------- FunAsVal ----------------------")
      
      val fun01:()=>String = () => {"hola"}
      println(fun01())
      
      val fun02:(Int)=>Int = (i) => {2*i}
      println(fun02(5))
      
      val fun03:(Int)=>Unit = (i:Int) => {println(s"Value: ${i*3}")}
      fun03(5)
      
      println("---------------------- -------- ----------------------")
  }
}