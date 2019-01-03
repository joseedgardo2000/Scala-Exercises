import drinks.sodas.inExistence
import drinks.sodas.showSodas

object PackageObject {
  def main(args:Array[String]):Unit =  {
      println("----------------------- PackageObject -----------------------")
      for(soda <- inExistence){
          showSodas(soda)
      }
      println("----------------------- ------------- -----------------------")
  }
}