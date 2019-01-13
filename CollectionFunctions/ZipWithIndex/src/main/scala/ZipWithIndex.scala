

object ZipWithIndex {
  def main(args:Array[String]):Unit = {
    println("====================== ZipWithIndex ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    println(s1)
    println("------------------------")
    println(s1.zipWithIndex)
    println("====================== ====== ======================")
  }
}