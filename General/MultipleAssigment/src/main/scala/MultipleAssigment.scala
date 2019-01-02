

object MultipleAssigment {
  def main(args:Array[String]):Unit = {
    
    val(val01, val02) = Tuple2(3,"value")
    val(val03, val04, val05) = (3,"value", 4.5f)
    
    println("val01: " + val01 + " val02: " + val02)
    println("val03: " + val03 + " val04: " + val04 + " val05: " + val05)
  }
}