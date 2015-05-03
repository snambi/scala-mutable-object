package com.cars

import java.util.Date

class Immutable( n: Int){
  val value = n;
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
    
    println("mutable = " + mutable);
    println("immutable = " + immutable);
  }
}