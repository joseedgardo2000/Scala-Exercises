

object ReverseIterator {
  def main(args:Array[String]):Unit = {
    println("====================== ReverseIterator ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    val r2 = s1.reverseIterator
    println(s1)
    r2.foreach(println)
    println("====================== ====== ======================")
  }
}