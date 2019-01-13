

object Union {
  def main(args:Array[String]):Unit = {
    println("====================== Union ======================")
    val s1 = Seq("pig", "horse", "cow", "monkey", "fly")
    val s2 = Seq("1", "2", "3", "4", "5")
    println(s1)
    println(s2)
    println(s1.union(s2))
    println(s2.union(s1))
    println("====================== ====== ======================")
  }
}