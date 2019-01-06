import scala.collection.SortedSet
import scala.collection.mutable.LinkedHashSet

case class Drink(name:String, flavour:String)

class Person(val name:String) extends Ordered[Person] {
    override def toString():String = {
        name
    }
    
    def compare(that:Person):Int = {
        if(this.name == that.name)
            0
        else if(this.name > that.name)
            1
        else
            -1
    }
}

object SortedSets {
  def main(args:Array[String]):Unit = {
      println("--------------------- SortedSets ---------------------")
      s1()
      s2()
      s3()
      println("--------------------- ---------- ---------------------")
  }
  
  def s1():Unit = {
      println("...... s1() ......")
      val o1 = SortedSet(1,5,6,2,4)
      val o2 = SortedSet("dog","cat","bird")
      val o3a: Ordering[Drink] = Ordering.by(_.name) 
      val o3b: Ordering[Drink] = Ordering.by(_.flavour)
      val o3c = SortedSet(Drink("Pepsi-Cola", "Cola"), Drink("Mirinda", "Orange"), Drink("Coca-Cola", "Cola"))(o3a)
      val o3d = SortedSet(Drink("Pepsi-Cola", "Cola"), Drink("Mirinda", "Orange"), Drink("Coca-Cola", "Orange"))(o3b)
      
      o1.foreach(e=>print(s"${e}\t")); println
      o2.foreach(e=>print(s"${e}\t")); println
      o3c.foreach(e=>print(s"${e}\t")); println
      o3d.foreach(e=>print(s"${e}\t")); println
      
  }
  
  def s2():Unit = {
      println("...... s2() ......")
      val pedro = new Person("Pedro")
      val rosa = new Person("Rosa")
      val rosa2 = new Person("Rosa")
      val leandro = new Person("Leandro")
      val p = SortedSet(pedro, rosa, leandro, rosa2)
      
      p.foreach(e=>print(s"${e}\t")); println
  }
  
  def s3():Unit = {
      println("...... s3() ......")
      val h = LinkedHashSet(Drink("Pepsi-Cola", "Cola"), Drink("Mirinda", "Orange"), Drink("Coca-Cola", "Cola"), Drink("Mirinda", "Orange"))
      h.foreach(e=>print(s"${e}\t")); println
  }
}