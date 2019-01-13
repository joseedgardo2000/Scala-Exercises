

object TakeRightWhile {
  def main(args:Array[String]):Unit = {
    println("====================== Filter ======================")
    val s1 = List("horse", "cow", "donkey", "pig", "monkey", "fly")
    val s2 = s1.takeWhile{a=>println(s"${a}: ${a.charAt(1)=='o'}"); a.charAt(1)=='o'}
    println(s1)
    println(s"Take       (3) => ${s1.take(3)}")
    println(s"Take Right (3) => ${s1.takeRight(3)}")
    println(s"TakeWhile (a=>a.charAt(1)=='o'): ${s2}")
    println("====================== ====== ======================")
  }
}