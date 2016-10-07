package main.scala.org.xhyu.example

import scala.util.Random

/**
 * Created by Administrator on 2016/10/6.
 */
object Node2f5 {
  def findFirst[A](as  : Array[A], p:A=>Boolean) : Int = {
    @annotation.tailrec
    def loop(n:Int) : Int = {
      if(n>=as.length) -1
      else if( p(as(n))) n
      else loop(n+1)
    }
    loop(0)
  }
  def isMatch(value : Byte) : Boolean = {
    if (value%3==0 ) true
    else false
  }
  def main(args: Array[String]) {
    val r = new Random()
    val bytes = new Array[Byte](10)
    r.nextBytes(bytes)
    bytes.foreach(x=>print(x+ ","))
    println()
    println(findFirst(bytes, isMatch))
    println(findFirst(Array(1,3,4), (x:Int)=>x==3))
  }
}
