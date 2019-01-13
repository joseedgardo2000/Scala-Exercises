

object Collect {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    val s1 = Seq(1, "pig", 2, "horse", 3, "cow", 4, "monkey", 5, "fly")
    println(s1)
    println(s"collect Int elemens: ${s1.collect({case e:Int => e})}")
    println(s"collect String elemens: ${s1.collect({case e:String => e})}")
    println("====================== ====== ======================")
  }
}