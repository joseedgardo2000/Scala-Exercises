object ObjA {
  def apply(name:String, surname:String) = {
      s"${name}:${surname}"
  }
  
  def apply(n1:Int, n2:Int) = {
      n1*n2
  }
  
  def unapply(nameSurname:String):Option[(String,  String)] = {
      val e:Array[String] = nameSurname.split(':')
      if(e.length==2) 
          Some(e(0), e(1))
      else 
          None
  }
}