

object ZipUnzip {
  def main(args:Array[String]):Unit = {
    println("------------------- ZipUnzip -------------------")
    val s1a = Seq("pig", "horse", "cow", "monkey", "fly")
    val s1b = Seq(1,2,3,4,5)
    f1(s1a,s1b)
    println("=================================================")
    f1(s1b,s1a)
    println("------------------- -------- -------------------")
  }
  
  def f1(Ia:Iterable[Any], Ib:Iterable[Any]):Unit = {
    println(Ia)
    println(Ib)
    println("-------- ZIP --------")
    val iAb = Ia.zip(Ib)
    println(iAb)
    println("-------- UNZIP --------")
    val u = iAb.unzip
    println(u)
    println(u._1)
    println(u._2)
  }
}