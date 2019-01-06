

object Maps {
  def main(args:Array[String]):Unit = {
      println("---------------- Maps ----------------")
      var a:Map[Int, String] = Map()
      val b:Map[Int, String] = Map(4->"Good Night", 5->"Good Bye", 6->"Bye")
      var c:Map[Int, String] = null
      
      a+=(1->"Hi")
      a+=(2->"Hello")
      a+=(3->"Good Day")
      
      a.foreach(e=>print(s"${e}\t")); println()
      
      c = a ++ b
      
      c.foreach(e=>print(s"${e}\t")); println()
      
      println(c.keys)
      println(c.values)
      
      val d = c.toSeq.sortBy(f=>f._1)
      d.foreach(e=>print(s"${e}\t")); println()
      println(d.getClass)
      println(d.min)
      println(d.max)
      println(c.min)
      println(c.max)
      println("---------------- ---- ----------------")
  }
}