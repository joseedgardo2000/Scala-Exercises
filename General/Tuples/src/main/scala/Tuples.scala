
case class Drink(name:String, flavour:String)

object Tuples {
  def main(args:Array[String]):Unit = {
      println("------------------ Tuples ------------------")
      t1()
      t2()
      println("------------------ ------ ------------------")
  }
  
  def t2():Unit = {
      println("......... t2() .........")
      val a:Tuple2[Int, String] = new Tuple2(10, "hello")
      println(a)
      println(a.swap)
  }
  
  def t1():Unit = {
      println("......... t1() .........")
      val p = (1, "hi", Drink("Mirinda", "Orange"))
      val q = (1,2)
      println(s"val1: ${p._1} - val2: ${p._2} - val3: ${p._3}")
      p.productIterator.foreach(e=>print(s"${e}\t")); println
      println(q)
      println(q.swap)
     
  }
}