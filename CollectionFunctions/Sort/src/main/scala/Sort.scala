

object Sort {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    val s2 = Seq(2->"pig", 1->"horse", 5->"cow", 4->"monkey", 3->"fly")
    println(s1)
    println(s1.sorted)
    println(s1.sortWith((a,b)=> a > b))
    println(s1.sortWith((a,b)=> a < b))
    println(s2)
    println(s2.sortBy(_._1))
    println(s2.sortBy(_._2))
    println("====================== ====== ======================")
  }
}