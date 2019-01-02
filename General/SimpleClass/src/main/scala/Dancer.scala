

class Dancer(val dancerName:String, val danceType:String) {
  
  def getDancerName():String = {
    dancerName
  }
  
  def moveArms():Unit = {
    println(dancerName + " is moving arms")
  }
  
  def moveHips():Unit = {
    println(dancerName + " is moving hips")
  }
  
  def moveLegs():Unit = {
    println(dancerName + " is moving legs")
  }
  
  def identificate() = {
    println("I'm " + dancerName + " and I like dance " + danceType)
  }
}