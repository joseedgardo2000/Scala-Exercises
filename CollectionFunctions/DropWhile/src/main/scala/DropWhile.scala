

object DropWhile {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    val s1 = Seq( "horse", "cow", "pig","monkey", "fly")
    println(s1)
    println(s1.dropWhile(p=>p.charAt(1)=='o'))
    println("====================== ====== ======================")
}
}