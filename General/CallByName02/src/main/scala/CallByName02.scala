

object CallByName02 {
  def main(args:Array[String]):Unit = {
      println("------------------ CallByName02 ------------------")
      val timeElpase = timer(println("Hola"))
      println(timeElpase)
      val (res, time) = timer(4*5)
      println(s"The time used to get the result ${res} is ${time}")
      println("------------------ ------------ ------------------")
  }
  
  def timer[A](blockOfCode: =>A):(A, Double) = {
      val startTime = System.nanoTime()
      val result = blockOfCode
      val stopTime = System.nanoTime()
      val delta = stopTime - startTime
      (result, delta/1000000d)
  }
}