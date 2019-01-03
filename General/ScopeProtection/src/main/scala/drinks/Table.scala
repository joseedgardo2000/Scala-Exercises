package drinks

import drinks.sodas.CommercialDrink

class Table {
  var drink = new CommercialDrink("Coca-Cola", "Cola", "Taste The Feeling")
  
  def describeDrinkOn():Unit = {
     println(s"There is a drink called ${drink.pName}, its flavor is ${drink.pFlavor} and its slogan is '${drink.slogan}'")
  }
}