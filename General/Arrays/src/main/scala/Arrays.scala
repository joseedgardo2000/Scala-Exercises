import Array.ofDim
import Array.range
import Array.concat

object Arrays {
    def main(args:Array[String]):Unit = {
        println("------------- Arrays -------------")
        simpleArray()
        println("........")
        multiArray()
        println("........")
        cocatArray()
        println("------------- ------ -------------")
    }
    
    def cocatArray():Unit = {
        val a = Array(1,2,3)
        val b = Array(4,5,6)
        val c = range(10,16,2)
        val d = concat(a,b,c)
        for(i<-0 to d.length-1)
            println(s"Val: ${d(i)}")
    }
    
    def multiArray():Unit = {
        val a:Array[Array[Int]]=ofDim[Int](3,3)
        val b:Array[Array[Int]]=Array(Array(1,2,3),Array(4,5,6), Array(7,8,9))
        for(i<-0 to 2) for(j<-0 to 2) a(i)(j) = (i + 1) * (j + 1)
        for(i<-a)
            for(j<-i)
                println(s"Val: ${j}")
        for(i<-0 to 2; j<-0 to 2)
            println(s"Value: ${b(i)(j)}")
    }
    
    def simpleArray():Unit = {
        val a:Array[Int] = new Array[Int](5)
        val b:Array[String] = Array("Maria", "Carlos", "Marta")
        
        for(i<-0 to 4) a(i) = i*2
        for(i <- a){println(s"Val: ${i}")}
        
        b.foreach(println)
    }
}