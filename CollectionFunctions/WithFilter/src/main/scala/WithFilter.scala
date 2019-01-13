

object WithFilter {
  def main(args:Array[String]):Unit = {
    println("====================== WithFilter ======================")
    val s1 = Seq("horse", "cow", "pig", "monkey", "fly")
    val s2 = s1.withFilter(p=>p.charAt(1)=='o')
    println(s1)
    println(s2)
    s2.foreach(println)
    println("====================== ====== ======================")
  }
}