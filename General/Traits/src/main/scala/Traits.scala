

object Traits {
  def main(args:Array[String]):Unit = {
      println("---------------- Traits ----------------")
      f1()
      f2()
      f3()
      f4()
      println("---------------- ------ ----------------")
  }
 
  def f4():Unit = {
      println("........ f4() ........")
      val a = new ClassABC
      a.ShowA()
      a.ShowB()
      a.ShowC()
  }
  
  def f3():Unit = {
      println("........ f3() ........")
      val a = new Hello
      val b = new Hola
      
      a.greet()
      b.greet()
      
      val f:(Greeting)=>Unit = (c)=>c.greet()
      
      f(a)
      f(b)
  }
  
  
  
  def f2():Unit = {
      println("........ f2() ........")
      val w = new Wrapper(5)
      w.print()
  }
  
  def f1():Unit = {
      println("........ f1() ........")
      val p1 = new Point(2,3)
      val p2 = new Point(4,5)
      val p3 = new Point(2,3)
      
      println(p1.isNotEqual(2))
      println(p1.isNotEqual(p2))
      println(p1.isNotEqual(p3))
  }
}