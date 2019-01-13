

object Head {
  def main(args:Array[String]):Unit = {
    println("====================== Head ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    println(s1)
    println(s"s1(0): ${s1(0)}")
    println(s"s1.head: ${s1.head}")
    println("====================== ====== ======================")
  }
}