

object Transpose {
  def main(args:Array[String]):Unit = {
    println("====================== Transpose ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    val s2 = Seq(1, 2, 3, 4, 5)
    val s3 = Seq(s1,s2)
    val t1 = s3.transpose
    val t2 = t1.transpose
    
    println(s"s1: ${s1}")
    println(s"s2: ${s2}")
    println(s"s3: ${s3}")
    
    println(s"Transpose1: ${t1}")
    println(s"Transpose2: ${t2}")
    println("-----------------")
    display1(t1)
    println("-----------------")
    display1(t2)
    println("-----------------")
    display1(t2.transpose)
    println("-----------------")
    display1(t2.transpose.transpose)
    
    println("====================== ====== ======================")
  }
  
  def display1(s:Seq[Seq[Any]]):Unit = {
    s.foreach(println)
  }
}