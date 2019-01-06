

object SRaw {
  def main(args:Array[String]):Unit = {
      val pal = "hello"
      println(s"\nb\n\t${pal}\na")
      println(raw"\nb\n\t${pal}\na")
  }
}