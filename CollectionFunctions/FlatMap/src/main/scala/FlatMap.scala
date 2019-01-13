

object FlatMap {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    val s2 = Seq("a", "b", "c", "d", "e")
    val s3 = Seq(s1, s2)
    val s4 = s3.flatMap(f=>f)
    
    println(s1)
    println(s2)
    println(s3)
    println(s4)
    
    println("====================== ====== ======================")
  }
}