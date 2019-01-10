import scala.util.matching.Regex

object RegularExpressions {
  def main(args:Array[String]):Unit = {
      println("------------------- RegularExpressions -------------------")
      f1()
      println("------------------- ------------------ -------------------")
  }
  
  def f1():Unit = {
      println("............. f1() .............")
      
      val p1:Regex = "mouse".r
      val p2 = "country$".r
      val p3 = new Regex("(H|h)ouse")
      
      val str1:String = "The mouse run fast to the country"
      val str2:String = "my country is very beautiful"
      val str3:String = "My House is your house and the house of the rising sun"
      
      val res1:String = p1.findFirstIn(str1).getOrElse("no match")
      val res2:String = p2.findFirstIn(str1).getOrElse("no match")
      val res3:String = p2.findFirstIn(str2).getOrElse("no match")
      val res4:Regex.MatchIterator = p3.findAllIn(str3)
      val res4b:String = p3.findAllIn(str3).mkString(", ")
      val res5:String = p3.replaceAllIn(str3, "castle")
      
      println(s"res1-p1: ${res1}")
      println(s"res2-p2: ${res2}")
      println(s"res3-p2: ${res3}")
      
      res4.foreach(m=>println(s"res4-p3 --> ${m}"))
      
      println(s"res4b-p3: ${res4b}")
      println(s"res5-p3: ${res5}")
  }
}