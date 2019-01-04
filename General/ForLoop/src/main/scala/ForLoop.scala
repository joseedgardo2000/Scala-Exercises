

object ForLoop {
  def main(args:Array[String]):Unit = {
      forRanges()
      forCollection()
      forFilters()
      forYield()
  }
  
  def forYield():Unit = {
      val l = List(1,2,3,4,5,6,7,8,9,10)
      println("-------------- forYield --------------")
      println(">>> for traversing List <<<")
      println((for{
          i <- l
      } yield i).toString())
      
      println((for{
          i <- l 
          if i > 3
          if i > 8 
      } yield i).toString())
          
      println("-------------- -------- --------------")
  }
  
  def forFilters():Unit = {
      val l = List(1,2,3,4,5,6,7,8,9,10);
      println("-------------- forFilters --------------")
      for(i <- l
              if(i!=3); if i<5){
         println(s"value: ${i}") 
      }
      println("-------------- -------------- --------------")
  }
  
  def forCollection():Unit = {
      val l = List(11,22,33,44,55)
      println("-------------- forCollections --------------")
      println(">>> for traversing List <<<")
      for(i <- l){
          println(s"value: ${i}")
      }
      println("-------------- -------------- --------------")
  }
  
  def forRanges():Unit = {
      println("-------------- forRanges --------------")
      println(">>> for to <<<")
      for(i <- 1 to 5){
          println(s"value: ${i}")
      }
      
      println(">>> for until <<<")
      for(i <- 1 until 5){
          println(s"value: ${i}")
      }
      
      println(">>> for double range <<<")
      for(i <- 1 to 5; j <- 1 to 5){
          println(s"value: ${i} - ${j}")
      }
      println("-------------- --------- --------------")
  }
}