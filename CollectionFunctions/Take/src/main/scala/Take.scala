

object Take {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    println(s1)
    for(i<-1 to 5)
      println(s"take(${i}) - ${s1.take(i)}")
    println("====================== ====== ======================")
  }
}