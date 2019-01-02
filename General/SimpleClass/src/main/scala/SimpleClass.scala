

object SimpleClass {
  def main(args:Array[String]):Unit = {
    println("------------- SimpleClass -------------")
    val mario = new Dancer("Mario", "Cumbia")
    val laura = new Dancer("Laura", "Salsa")
    
    println(laura.dancerName + " comes to dance")
    laura.moveArms()
    laura.moveHips()
    laura.identificate()
    
    println("\n" + mario.dancerName + " comes to dance")
    mario.moveLegs()
    mario.moveArms()
    mario.moveLegs()
    mario.identificate()
    println("------------- ----------- -------------")
  }
}