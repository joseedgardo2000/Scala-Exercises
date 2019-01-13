

object Intersect {
  def main(args:Array[String]):Unit = {
    println("====================== Intersect ======================")
    val s1 = Seq("pig",  "horse", "cow",     "monkey", "fly")
    val s2 = Seq("wolf", "horse", "octopus", "mouse",   "fly")
    println(s1)
    println(s2)
    println("s1.intersect(s2): " + s1.intersect(s2))
    println("s2.intersect(s1): " + s2.intersect(s1))
    println("====================== ====== ======================")
  }
}