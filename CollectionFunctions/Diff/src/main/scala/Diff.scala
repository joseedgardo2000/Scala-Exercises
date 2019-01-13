

object Diff {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    val s1 = Seq("pig",  "horse", "cow",     "monkey", "fly")
    val s2 = Seq("wolf", "horse", "octopus", "mouse",   "fly")
    println(s1)
    println(s2)
    println("s1.diff(s2): " + s1.diff(s2))
    println("s2.diff(s1): " + s2.diff(s1))
    println("====================== ====== ======================")
  }
}