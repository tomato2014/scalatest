package main.scala.org.xhyu.example

sealed trait List[+A]  // list是一个泛型的数据类型，类型参数用A表示
case object Nil extends List[Nothing]  //用于表现空list的List数据构造器
case class Cons[+A](head:A,tail:List[A]) extends List[A]  /* 另一个数据构造器，呈现非空List。注意尾部是另一个List[A]
，当然这个尾部也可能为Nil或是另一个Cons
*/

/**
 * Created by Administrator on 2016/10/7.
 */
object Node3f1 {  // List伴生对象。包含创建List和对List操作的一些函数
  def sum(ints:List[Int]) : Int = ints match { // 利用模式匹配对一个整数型List进行合计
    case Nil => 0 // 空列表的累加值为0
    case Cons(x,xs) => x + sum(xs)
  }
  def product(ds : List[Double]):Double = ds match {
    case Nil => 1.0
    case Cons(0.0,_)=>0.0
    case Cons(x,xs) => x * product(xs)
  }
  def apply[A](as: A*) : List[A] =
  if(as.isEmpty) Nil
  else Cons(as.head,apply(as.tail: _*))
}
