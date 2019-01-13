

object MkString {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    println(s1)
    println(s1.mkString(" and "))
    println(s1.mkString("Tha animals are ", " and ", ", they are interesting"))
    println("====================== ====== ======================")
  }
}