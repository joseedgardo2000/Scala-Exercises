

object Par {
  def main(args:Array[String]):Unit = {
    println("====================== Par ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    val s2 = s1.par
    val s3 = s2.toList
    println("original: " + s1)
    println("parallel: " + s2)
    println("parallel List: " + s3)
    println("====================== ====== ======================")
  }
}