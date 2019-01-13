

object FoldRight {
  def main(args:Array[String]):Unit = {
    println("====================== ReduceRightLeft ======================")
    val s1 = Seq("a", "b", "c", "d", "e")
    println("s1.foldRight(\"<<\"){(a,B)=> println(s\"${a} + ${B} \"); a + B}")
    val r1 = s1.foldRight("<<"){(a,B)=> println(s"${a} + ${B} "); a + B}
    println("-----")
    println("s1.foldLeft(\">>\"){(B,a)=> println(s\"${B} + ${a} \");  B + a}")
    val r2 = s1.foldLeft(">>"){(B,a)=> println(s"${B} + ${a} ");  B + a}
    println("-----")
    
    println(s1)
    println(r1)
    println(r2)
    
    println("====================== =============== ======================")
  }
}