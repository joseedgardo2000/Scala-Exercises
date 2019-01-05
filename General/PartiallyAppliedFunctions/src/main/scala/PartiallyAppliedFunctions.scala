

object PartiallyAppliedFunctions {
  def main(args:Array[String]):Unit = {
     println("----------------------- PartiallyAppliedFunctions -----------------------") 
     
     println("...... Full Calling .....")
     animalAction("cat", "eat")
     animalAction("cat", "meow")
     animalAction("cat", "walk")
     
     println("...... Partial Calling .....")
     val dogAction = animalAction("dog", _:String)
     
     dogAction("eat")
     dogAction("bark")
     dogAction("walk")
     
     
     println("----------------------- ------------------------- -----------------------")
  }
  
  def animalAction(animal:String, action:String):Unit = {
      println(s"The ${animal} uses ${action}")
  }
}