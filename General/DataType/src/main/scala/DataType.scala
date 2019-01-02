

object DataType {
  def main(args:Array[String]):Unit = {
    val a:Byte = 110;
    val b:Short = 110;
    val c:Int = 110;
    val d:Long = 110;
    val e:Float = 110;
    val f:Double = 110;
    val g:Char = 110;
    
    
    println("a:" + a.getClass() + ":" + a)
    println("b:" + b.getClass() + ":" + b)
    println("c:" + c.getClass() + ":" + c)
    println("d:" + d.getClass() + ":" + d)
    println("e:" + e.getClass() + ":" + e)
    println("f:" + f.getClass() + ":" + f)
    println("g:" + g.getClass() + ":" + g)
    println("\"Hola\":" + "Hola".getClass() + ":" + "Hola")
    println("10.0:" + 10.0.getClass() + ":" + 10.0)
    println("10.0f:" + 10.0f.getClass() + ":" + 10.0f)
    println("'a':" + 'a'.getClass() + ":" + "a")
    
  }
}