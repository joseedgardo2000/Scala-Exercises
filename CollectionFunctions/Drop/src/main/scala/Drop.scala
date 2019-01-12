

object Drop {
  def main(args:Array[String]):Unit = {
    println("=============== Drop ===============")
    val s1 = Seq("cat", "dog", "elephant", "lion", "snake")
    val s2 = Set(1, 2, 3, 4, 5)
    val s3 = Map(1->"a",2->"b",3->"c",4->"d",5->"e")
    display(s1)
    display(s2)
    display(s3)
    println("------------------------------------")
    f1(s1)
    f1(s2)
    f1(s3)
    println("=============== ==== ===============")
  }
  
  def display(s:Iterable[Any]):Unit = {
    println(s)
  }
  
  def f1(s:Iterable[Any]):Unit = {
    println("................... f1() ...................")
    val d = s.drop(2)
    display(d)
  }
}