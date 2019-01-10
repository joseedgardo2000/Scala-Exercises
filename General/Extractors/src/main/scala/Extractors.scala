

object Extractors {
  def main(args:Array[String]):Unit = {
      println("-------------- Extractors --------------")
      f1()
      f2()
      println("-------------- ---------- --------------")
  }
  
  def f2():Unit = {
      val s1 = ObjA("Reyna", "Valera")
      display2(s1)
      display2("Laslo:Losla")
      display2("Nadia Rocha")
  }
  
  def display2(o:String):Unit = {
      o match {
          case ObjA(name, surname) => println(s"eName: ${name} - eSurname: ${surname}") 
          case _ => println("unknow person")
      }
  }
  
  def f1():Unit = {
      val s1 = ObjA("Daniel", "San")
      val s2 = ObjA.apply("Dolores", "Plata")
      val n1 = ObjA(10,50)
      val n2 = ObjA.apply(5, 4)
      val o1 = ObjA.unapply(s1)
      val o2 = ObjA.unapply(s2)
      val o3 = ObjA.unapply("Manuel Moran")
      println(s1)
      println(s2)
      println(n1)
      println(n2)
      println(o1)
      println(o2)
      println(o3)
      display(o1)
      display(o2)
      display(o3)
  }
  
  def display(p:Option[(String, String)]):Unit = {
      p match {
          case Some((name, surname)) => println(s"name: ${name} - surname: ${surname}")
          case None => println("Unknow")
      }
  }
}