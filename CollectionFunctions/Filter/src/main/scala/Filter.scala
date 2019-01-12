

object Filter {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    display(s1)
    f1(s1)
    println("====================== ====== ======================")
  }
  
  def f1(s:Iterable[Any]):Unit = {
    val p = "y$".r
    val f = (pal:String) => p.findFirstIn(pal) match {
      case Some(pal) => true
      case None => false
    }
    
    val sf1 = s.filter(pal=>f(pal.toString()))
    val sf2 = s.filterNot(pal=>f(pal.toString()))
    
    println(s"filter: ${sf1}")
    println(s"filterNot: ${sf2}")
  }
  
  def display(s:Iterable[Any]):Unit = {
    println(s)
  }
}