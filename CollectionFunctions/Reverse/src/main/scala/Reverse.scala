

object Reverse {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    println(s1)
    println(s"reverse: ${s1.reverse}")
    println("====================== ====== ======================")
  }
}