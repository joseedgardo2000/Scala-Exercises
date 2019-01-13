

object Last {
  def main(args:Array[String]):Unit = {
    println("====================== Last ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    val s2 = Seq()
    println(s1)
    println(s"s1(s1.size-1): ${s1(s1.size-1)}")
    println(s"s1.last: ${s1.last}")
    
    println("====================== ====== ======================")
  }
}