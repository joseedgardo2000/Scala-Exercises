trait Printable extends Any {
    def print():Unit = println(this)
}

class Wrapper(val underlying:Int) extends AnyVal with Printable {
    override def toString():String = {
        s"Underlying ${underlying}"
    }
}