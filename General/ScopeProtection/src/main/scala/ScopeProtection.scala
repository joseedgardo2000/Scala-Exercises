import drinks.Table
import drinks.sodas.Drink
import drinks.sodas.CommercialDrink


object ScopeProtection {
  def main(args:Array[String]):Unit = {
      println("------------------ ScopeProtection ------------------")
      val drink = new Drink("Coca-Cola", "Cola")
      val table = new Table();
      drink.describe()
      table.describeDrinkOn()
      println("------------------ --------------- ------------------")
      
  }
}