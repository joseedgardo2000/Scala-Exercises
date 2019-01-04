import scala.util.control.Breaks

object BreakableLoop {
  def main(args:Array[String]):Unit = {
      println("----------- BreakableLoop -----------")
      val l = List(11,22,33,44,55, 66, 77)
      val cicle = new Breaks
      cicle.breakable{
          for(i <- l){
              println(s"Value: ${i}")
              if(i==44)
                  cicle.break;
          }
      }
      
      println("----------------------")
      val outer = new Breaks
      val inner = new Breaks
      val l1 = List(1,2,3,4,5)
      val l2 = List('a','b','c','d', 'e')
      
      outer.breakable{
          for(i <- l1){
             println(s"Value: ${i}")
             inner.breakable{
                 for(j <- l2){
                     print(s"	Value: ${j} ")
                     if(i==3 && j=='c'){
                         inner.break
                     }
                 }
             }
             if(i==3)
                 outer.break
             println()
          }
      }
      
      
      println("\n-------------------------------------")
  }
}