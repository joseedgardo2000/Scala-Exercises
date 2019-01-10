import java.io.File
import java.io.PrintWriter
import scala.io.StdIn
import scala.io.Source

object Files {
  def main(args:Array[String]):Unit = {
      println("-------------- Files --------------")
      println(s"Current Path: ${new File(".").getCanonicalPath}")
      f1()
      f2()
      f3()
      println("-------------- ----- --------------")
  }
  
  def f1():Unit = {
      println("....... f1() .......")
      val w = new PrintWriter(new File("text.txt"))
      w.write("Scala is a beautiful language")
      w.close()
  }
  
  def f2():Unit = {
      println("....... f2() .......")
      println("Enter your words: ")
      val words1 = StdIn.readLine()
      val words2 = StdIn.readLine(">>>")
      
      println(words1)
      println(words2)
      
  }
  
  def f3():Unit = {
      println("....... f3() .......")
      Source.fromFile("text.txt").foreach(print)
      println()
  }
}