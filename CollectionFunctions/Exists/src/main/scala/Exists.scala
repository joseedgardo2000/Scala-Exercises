

object Exists {
  def main(args:Array[String]):Unit = {
    println("====================== Exists ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    println(s1)
    println("s1.exists(p=>p==\"monkey\"): " + s1.exists(p=>p=="monkey"))
    println("====================== ====== ======================")
  }
}