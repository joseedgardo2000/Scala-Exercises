

class SubA(override val a:Int, override val b:Int, val c:Int) extends Base(a, b) {
  override def printB():Unit = {
    super.printB()
    println("SubA b: " + b)
  }
  
  
  def printC():Unit = {
    println("C: " + c)
  }
}