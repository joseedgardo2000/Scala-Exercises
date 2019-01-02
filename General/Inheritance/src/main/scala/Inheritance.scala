

object Inheritance {
  def main(args:Array[String]):Unit = {
    println("\n-------------- Inheritance --------------")
    val a = new Base(10,20)
    val b = new SubA(30, 40, 50)
    a.printA()
    a.printB()
    b.printA()
    b.printB()
    b.printC()
    
    println("\n-------------- ----------- --------------")
  }
}