package drinks.sodas

class CommercialDrink(override val pName:String, override val pFlavor:String, val pSlogan:String) extends Drink(pName, pFlavor) {
    private[drinks] var slogan = pSlogan
    
    override def describe():Unit = {
        println(s"${name} flavor is ${flavor} and its slogan is ${slogan}")
    }
  
}