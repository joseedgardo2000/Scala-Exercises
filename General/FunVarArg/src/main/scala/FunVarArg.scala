

object FunVarArg {
  def main(arg:Array[String]):Unit = {
      val l=List("cat", "dog", "horse")
      val l2=List(11,22,33,44,55)
      println("---------------- FunVarArg ----------------")
      printStrings("hi","hello", "Good Morning", "Bye")
      println("...........")
      printInts(1,2,3,4,5)
      println("...........")
      printStrings(l: _*)
      println("...........")
      printInts(l2: _*)
      println("-------------------------------------------")
  }
  
  def printInts(ints:Int*){
      for(i <- ints) println(i)
  }
  
  def printStrings(strs:String*){
      strs.foreach(println)
  }
  
}