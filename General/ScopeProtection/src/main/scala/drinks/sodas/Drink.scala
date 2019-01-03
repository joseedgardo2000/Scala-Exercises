package drinks{
    package sodas{
        class Drink(val pName:String, val pFlavor:String){
            private[sodas] var name = pName
            private[sodas] var flavor = pFlavor
            def describe():Unit = {
                println(s"${name} flavor is ${flavor}")
            }
        }
    }
}