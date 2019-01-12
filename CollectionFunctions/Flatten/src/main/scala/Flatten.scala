

object Flatten {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    val m1 = Map(1->"pig", 2->"horse", 3->"cow", 4->"monkey", 5->"fly")
    val se1 = Set("pig", "horse", "cow", "monkey", "fly")
    
    
    display(m1)

    
    println("-----------------")
    display(s1)
    f1(s1)
    f2(s1)
    println("-----------------")
    display(se1)
    f1(se1)
    f2(se1)
    println("-----------------")
    display(m1)
    // f1(m1)
    f3(m1)
    f4(m1)
    
    println("====================== ====== ======================")
  }
  
  def f1(s:Iterable[String]):Unit = {
    s.flatten.foreach(e=>print(s"[${e}]"))
    println
  }
  
  
  def f2(s:Iterable[Any]):Unit = {
    s.asInstanceOf[Iterable[String]].flatten.foreach(e=>print(s"[${e}]"))
    println
  }
  
  def f3(s:Iterable[Any]):Unit = {
    s.asInstanceOf[Iterable[(Int,String)]].flatten(e=>s"${e}").foreach(e=>print(s"[${e}]"))
    println
  }
  
  def f4(s:Iterable[Any]):Unit = {
    s.asInstanceOf[Iterable[(Int,String)]].flatten(e=>"abc").foreach(e=>print(s"[${e}]"))
    println
  }
  
  def display(s:Iterable[Any]):Unit = {
    println(s)
  }
}