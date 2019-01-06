

object Sets {
  def main(args:Array[String]):Unit = {
      println("------------------ Sets -------------------")
      s1()
      s2()
      s3()
      println("------------------ ---- -------------------")
  }
  
  def s3():Unit = {
      val a = Array(16,17,18,19)
      var s = scala.collection.mutable.Set(1,1,2,3,3,4,5,5)
      
      println("_____________ s3() _____________")
      s.foreach(e=>print(s"${e}\t")); println
      s.add(6)
      s += (7,8)
      s.foreach(e=>print(s"${e}\t")); println
      s ++= a
      s.foreach(e=>print(s"${e}\t")); println
      s.filter(e => e > 3).foreach(e=>print(s"${e}\t")); println  
      
  }
  
  def s2():Unit = {
      val l = List(5,6,7,7)
      var e = Set(1,1,2,2,3)
      println("_____________ s2() _____________")
      e.foreach(e=>print(s"${e}\t")); println
      e = e + 4
      e.foreach(e=>print(s"${e}\t")); println
      e ++= l
      e.foreach(e=>print(s"${e}\t")); println
  }
  
  def s1():Unit = {
      val e = Set(1,1,2,2,3)
      println("_____________ s1() _____________")
      e.foreach(e=>print(s"${e}\t")); println
      val e1 = e + 4
      e1.foreach(e=>print(s"${e}\t")); println
  }
}