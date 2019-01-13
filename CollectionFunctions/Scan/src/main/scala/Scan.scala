

object Scan {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    val s2 = Seq(1,2,3,4,5)
    val sc1 = s1.scan("")(_ + _)
    val sc2 = s2.scan(0){(a,b)=> println(s"${a} + ${b}"); a + b}
    
    println(s1)
    println(sc1)
    
    println(s2)
    println(sc2)
    
    println("====================== ====== ======================")
  }
}