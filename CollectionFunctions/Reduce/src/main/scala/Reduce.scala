

object Reduce {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    val s1 = Seq("a", "b", "c", "d")
    println(s1)
    println(s1.reduce{(a,b)=> println(s"${a} + ${b}"); a+b})
    println("====================== ====== ======================")
  }
}