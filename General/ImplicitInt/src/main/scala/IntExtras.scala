

object IntExtras {
  implicit class IntLoops(i:Int){
      def times[A](f: =>A): Unit = {
          def loop(current:Int): Unit = 
              if(current>0){
                  f
                  loop(current - 1)
              }
          loop(i)
      }
  }
}