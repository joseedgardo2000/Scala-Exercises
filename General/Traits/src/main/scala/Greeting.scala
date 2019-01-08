

trait Greeting {
  def greet():Unit
}

class Hello extends Greeting {
    def greet():Unit = {
        println("Hello")
    }
}

class Hola extends Greeting {
    def greet():Unit = {
        println("Hola")
    }
}