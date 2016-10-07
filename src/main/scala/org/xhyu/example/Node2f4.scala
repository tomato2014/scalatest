package main.scala.org.xhyu.example

/**
 * Created by Administrator on 2016/10/6.
 */
object Node2f4 {
  def abs(n:Int ):Int = {
    if ( n <0 ){
      -n
    }
    else {
      n
    }
  }
  def factorial(n:Int) :Int ={
    @annotation.tailrec
    def go(n:Int,acc:Int) :Int ={
      if(n<=0) acc
      else go(n-1,n*acc)
    }
    go(n,1)
  }
  def formatResult(name:String,n:Int,f:Int => Int) ={
    val msg = "the %s of %d is %d."
    msg.format(name,n, f(n))
  }


  def main(args: Array[String]) {
    System.out.println(abs(-10))
    System.out.println(factorial(5))
    println(formatResult("abs",-10,abs ))
    println(formatResult("fact",5,factorial ))
  }
}