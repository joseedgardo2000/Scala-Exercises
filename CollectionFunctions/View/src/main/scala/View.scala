

object View {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    // val s1 = (1 to 500000000).filter(p=> p%2==0).take(10).toList     // Get out of memory
    val s1 = (1 to 500000000).view.filter(p=> p%2==0).take(10).toList
    
    println(s1)
    println("====================== ====== ======================")
  }
}