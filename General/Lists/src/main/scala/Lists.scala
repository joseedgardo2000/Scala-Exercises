

object Lists {
  def main(args:Array[String]):Unit = {
      println("--------------------- Lists ---------------------")
      e1()
      e2()
      println(".............")
      println("--------------------- ----- ---------------------")
  }
  
  def e2():Unit = {
      println("______ e2 ______")
      // Lisp Style
      val f1:List[String] = "dog"::"cat"::"bird"::Nil 
      val f2 = "dog"::("cat"::("bird"::Nil))
      // Java Style
      val j1:List[Int] = List(1,2,3,4,5)
      val j2 = List[Number](6,7.0f,8l,9d,10.0)
      //Range
      val r1 = List.range(11, 15)
      val r2 = List.range(11, 20, 2)
      //fill
      val f3 = List.fill(3)("kokoro")
      // tabulate
      val t1:List[String] = List.tabulate(5)(f=>s"v: ${f}")
      f1.foreach(e=>print(s"${e} ")); println()
      f2.foreach(e=>print(s"${e} ")); println()
      j1.foreach(e=>print(s"${e}\t")); println()
      j2.foreach(e=>print(s"${e}\t")); println()
      r1.foreach(e=>print(s"${e}\t")); println()
      r2.foreach(e=>print(s"${e}\t")); println()
      f3.foreach(e=>print(s"${e}\t")); println()
      t1.foreach(e=>print(s"${e}\t")); println()
  }
  
  def e1():Unit = {
      println("______ e1 ______")
      // List of String
      val f:List[String] = List("dog", "cat", "bird")
      // List of Int 
      val a = List(1,2,3,4,5)      // Empty list
      val empty: List[Nothing] = List()
      // 2 dimentions List
      val t:List[List[Int]] = 
          List(
                  List(1,2,3),
                  List(4,5,6,7),
                  List(8,9,10,11,12)
              )
      
      a.foreach(e=>print(s"${e} "))
      println
      f.foreach(e=>print(s"${e} "))
      println
      for(l<-t){
          for(e <- l){
              print(s"${e}\t")
          }
          println()
      }
      
      println()
  }
}