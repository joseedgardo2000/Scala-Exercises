

object GroupBy {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly", "octopus", "snake", "fish")
    val s2 = s1.map(f=>(f.charAt(0), f))
    val s3 = s2.groupBy(f=>f._2.length())
    println(s1)
    println(s2)
    println(s3)
    println("-------------------------")
    s3.foreach(println)
    println("====================== ====== ======================")
  }
}