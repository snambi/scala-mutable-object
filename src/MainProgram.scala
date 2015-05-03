class Immutable( n: Int){
  val value = n;
  // following line results in compilation error
  //def setValue( n:Int){ value =n; }
  override def toString(): String = "("+ value + ")";
}

class Mutable( x:Int){
  var value = x;
  def setValue( n:Int){ value =n; }
  override def toString(): String = "("+ value + ")";
}

object MainProgram {
  def main( args: Array[String] ){
    
    val mutable = new Mutable(10);
    val immutable = new Immutable(5);
    
    println("mutable = " + mutable);
    println("immutable = " + immutable);
    
    mutable.setValue(100);
    
    // following line results in compilation error
    //immutable.value = 200;
    
    println("mutable = " + mutable);
    println("immutable = " + immutable);
  }
}
