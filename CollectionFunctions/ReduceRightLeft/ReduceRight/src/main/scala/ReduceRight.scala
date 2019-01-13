

object ReduceRight {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    val s1 = Seq("a", "b", "c", "d", "e")
    val r1 = s1.reduceRight{(a,B)=> println(s"${a} + ${B} "); a + B}
    println("-----")
    val r2 = s1.reduceLeft{(B,a)=> println(s"${B} + ${a} ");  B + a}
    println("-----")
    println(s1)
    println(r1)
    println(r2)
    
    println("====================== ====== ======================")
  }
}