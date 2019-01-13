

object Fold {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    val s1 = Seq("a", "b", "c", "d", "f")
    println(s1)
    println(s1.fold(""){(a,b)=>println(s"${a} + ${b}"); a+b})
    println("====================== ====== ======================")
  }
}