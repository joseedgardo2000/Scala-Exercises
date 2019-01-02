

object RectangleImplicits {
    implicit class RectangleFormulas(val rect:Rectangle) {
        def perimeter():Float = {
            2 * rect.base + 2 * rect.height
        }
    }
  
}