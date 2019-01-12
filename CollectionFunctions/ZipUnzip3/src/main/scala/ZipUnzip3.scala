

object ZipUnzip3 {
  def main(args:Array[String]):Unit = {
    println("------------------- ZipUnzip -------------------")
    val s1a = Seq((1,"pig", "farm"), (2,"horse","farm"), (3,"cow","farm"), (4, "monkey","jungle"), (5, "fly","house"))
    println("=================================================")
    f1(s1a)
    println("------------------- -------- -------------------")
  }
  
  def f1(iA:Iterable[Any]):Unit = {
    println(iA)
    println("-------- UNZIP3 --------")
    val u:(Seq[Int], Seq[String], Seq[String]) = iA.asInstanceOf[Seq[(Int, String, String)]].unzip3
    println(u)
    println(u._1)
    println(u._2)
    println(u._3)
  }
}