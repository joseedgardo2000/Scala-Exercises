import scala.collection.TraversableLike


object Partitions {
  def main(args:Array[String]):Unit = {
    println("------------------- Partitions -------------------")
    val s1 = Set[Any]("dog", 2, "cat", 4, "lion", 3, "monkey", 1)
    val s2 = Seq[Any]("dog", 2, "cat", 4, "lion", 3, "monkey", 1)
    
    display(s1)
    display(s2)
    f1(s1)
    println("===========================")
    f1(s2)
    println("------------------- ---------- -------------------")
  }
  
  def display(s:Iterable[Any]):Unit = {
    println(s)
  }
  
  def display2(s:Iterable[Any]):Unit = {
    s.foreach(e=>println(s"val: ${e}"))
  }
  
  def f1(s:Iterable[Any]):Unit = {
    println("............... f1() ..............")
    val a = s.partition{p=>
        p match {
          case name:String => true
          case number:Int => false
        }
      }
    println(a)
    val s1 = a._1
    val s2 = a._2
    
    display(s1)
    display(s2)
    println("_______________")
    display2(s1)
    println("_______________")
    display2(s2)
  }
}