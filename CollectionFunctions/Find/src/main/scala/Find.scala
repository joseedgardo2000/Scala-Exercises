

object Find {
  def main(args:Array[String]):Unit = {
    println("====================== Find ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    println(s1)
    println(s"Find: monkey - ${s1.find(p=>p == "monkey")}")
    println(s"Find: wolf - ${s1.find(p=>p == "wolf")}")
    println("====================== ====== ======================")
}
}