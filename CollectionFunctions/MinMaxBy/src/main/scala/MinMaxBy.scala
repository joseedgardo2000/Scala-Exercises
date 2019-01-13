

object MinMaxBy {
  def main(args:Array[String]):Unit = {
    println("====================== MinMaxBy ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    val s2 = Seq(1->"pig", 2->"horse", 3->"cow", 4->"monkey", 5->"fly")
    println(s1)
    println(s1.min)
    println(s1.max)
    println(s2)
    println(s2.minBy(f=>f._1))
    println(s2.maxBy(f=>f._1))
    println(s2.minBy(f=>f._2))
    println(s2.maxBy(f=>f._2))
    println("====================== ====== ======================")
  }
}