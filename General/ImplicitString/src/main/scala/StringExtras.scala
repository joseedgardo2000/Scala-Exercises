

object StringExtras {
  implicit class StringPlus(s:String){
      def increment(i:Int):String = {
          s.map(c=>(c+1).toChar)
      }
  }
}