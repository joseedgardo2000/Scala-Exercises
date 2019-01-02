import RectangleImplicits.RectangleFormulas

object ImplicitClass01 {
  def main(args:Array[String]):Unit = {
    println("\n---------------- ImplicitClass01 ----------------\n")
    val rec = new Rectangle(5,4)
    rec.perimeter()
    println(s"The area is ${rec.base} x ${rec.height} = ${rec.area()}")
    println(s"The perimeter is 2 x ${rec.base} + 2 x ${rec.height} = ${rec.perimeter()}")
    println("\n-------------------------------------------------\n")
  }
}