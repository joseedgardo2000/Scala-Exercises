import java.io.FileReader
import scala.util.control.Exception.Catch
import java.io.FileNotFoundException
import java.io.IOException


object TryCatchFinally {
  def main(args:Array[String]):Unit = {
      println("------------------ TryCatchFinally ------------------")
      f1()
      println("------------------ --------------- ------------------")
  }
  
  def f1():Unit = {
      println("......... f1() - ini .........")
      try{
          val f = new FileReader("fileToRead.txt")
      } catch {
          case e: FileNotFoundException => println("The file don't exists")
          case e: IOException => println("IO Exception")
      } finally {
          println("......... f1() - end  .........")
      }
  }
}