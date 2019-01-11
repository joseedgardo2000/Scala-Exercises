

object Aggregate {
  def main(args:Array[String]):Unit = {
    println("------------------------- Aggregate -------------------------")
    val s = Set("dog", "cat", "monkey", "lion", "monkey")
    display(s)
    f1(s)
    f2(s)
    f3(s)
    println("------------------------- --------- -------------------------")
  }
  
  def f3(s:Set[String]):Unit = {
    println("......... f3() .........")
    val strAccumulator:(String, String) => String = (acc, animal) => s"${acc} - ${animal}"
    val partAccumulator:(String, String) => String = (part1, part2) => part1 + part2
    val fullConcat = s.aggregate("")(strAccumulator, partAccumulator)
    println(fullConcat)
  }
  
  def f2(s:Set[String]):Unit = {
    println("......... f2() .........")
    val strAccumulator:(String, String) => String = (acc, animal) => s" - acc: ${acc} + animal: ${animal} - \n"
    val partAccumulator:(String, String) => String = (part1, part2) => s" > part1: ${part1} + part2: ${part2} < \n"
    val fullConcat = s.aggregate("Init: ")(strAccumulator, partAccumulator)
    println(fullConcat)
  }
  
  
  
  
  def f1(s:Set[String]):Unit = {
    println("......... f1() .........")
    
    val strLengthAccumulator: (Int, String) => Int = (accumulator, animal) => accumulator + animal.length()
    val partitionAccumulator: (Int, Int) => Int = (partitionA, partitionB) => partitionA + partitionB
    //s.aggregate(0)(seqop, combop)
    
    val fullLength = s.aggregate(0)(strLengthAccumulator, partitionAccumulator)
    
    println(s"fullLength: ${fullLength}")
    
  }
  
  def display(s:Set[String]):Unit = {
    println("......... display() .........")
    println(println(s"Set values: ${s}"))
  }
}