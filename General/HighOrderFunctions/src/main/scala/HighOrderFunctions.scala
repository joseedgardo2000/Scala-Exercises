/*
 * Functionswhich receive other functions as parameters or a returns
 */

case class Pet(name:String, kind:String)

object HighOrderFunctions {
    def main(args:Array[String]):Unit = {
        println("-------------------- HighOrderFunctions --------------------")
        
        exampleMap()
        funAsArgs()
        funAsReturn()
        
        println("-------------------- ------------------ --------------------")
        println("")
    }
    //-------------------------------------------------------------------------
    def funAsReturn():Unit = {
        val misifus = Pet("Misifus", "cat")
        val firulais = Pet("Firulais", "dog")
        val birdy = Pet("Birdy", "bird")
        
        println(howExpress(misifus)(misifus))
        println(howExpress(firulais)(firulais))
        println(howExpress(birdy)(birdy))
    }
    
    def howExpress(pet:Pet):(Pet)=>String = {
        val x = pet.kind
        x match {
            case "cat"=> bark 
            case "dog" => meow
            case "bird" => tweet
        }
    }
    
    def bark(pet:Pet):String = {
        s"${pet.name} is a ${pet.kind} and ${pet.kind}s bark"
    }
    
    def meow(pet:Pet):String = {
        s"${pet.name} is a ${pet.kind} and ${pet.kind}s meow"
    }
    
    def tweet(pet:Pet):String = {
        s"${pet.name} is a ${pet.kind} and ${pet.kind}s tweet"
    }
    
    //-------------------------------------------------------------------------
    def exampleMap():Unit = {
        println(".......... exampleMap ..........")
        val pets = Seq("cat", "dog", "bird")
        val setPet = (x:String) => {s"${x} is a pet"}
        val whichIsPet:Seq[String]= pets.map(setPet)
        val whichIsPet02:Seq[String]= pets.map(x=>s"${x} is a super pet")
        whichIsPet.foreach(println)
        whichIsPet02.foreach(println)
    }
    //-------------------------------------------------------------------------
    def funAsArgs():Unit = {
        println(".......... funAsArgs ..........")
        val pets = Seq("cat", "dog", "bird")
        petYourPet(pets, feed)
        petYourPet(pets, caress)
    }
    
    def petYourPet(pets:Seq[String], action:(String)=>Unit):Unit = {
        pets.foreach(action)
    }
    
    def feed(pet:String):Unit = {
        println(s"Your ${pet} is eating")
    }
    
    def caress(pet:String):Unit = {
        println(s"Your ${pet} is being caressed")
    }
}