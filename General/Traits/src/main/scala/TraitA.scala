

trait TraitA {
  def ShowA():Unit
}

trait TraitB {
    def ShowB():Unit
}

trait TraitC {
    def ShowC():Unit = {
        println("C")
    }
}

class ClassABC extends TraitA with TraitB with TraitC{
    def ShowA():Unit = {
        println("A")
    }
    
    def ShowB():Unit = {
        println("B")
    }
    
    override def ShowC():Unit = {
        println("CC")
    }
}