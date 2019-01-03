package drinks

package object sodas {
    val inExistence = List(CocaCola, Mirinda, PepsiCola)
    def showSodas(soda:Soda):Unit = {
        println(s"${soda.name} flavor is ${soda.flavor}")
    }
}