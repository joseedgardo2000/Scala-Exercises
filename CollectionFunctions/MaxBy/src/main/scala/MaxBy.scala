

object MaxBy {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    val s1 = Seq(1->"pig", 2->"horse", 3->"cow", 4->"monkey", 5->"fly")
    println(s1)
    println(s"s1.maxBy(a=>a._1): ${s1.maxBy(a=>a._1)}")
    println(s"s1.maxBy(a=>a._2): ${s1.maxBy(a=>a._2)}")
    println("====================== ====== ======================")
  }
}