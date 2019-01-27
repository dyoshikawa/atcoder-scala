package example

import scala.io.StdIn._

// ABC 086 A - Product
object Hello extends App {
  val a: Int = readInt()
  val b: Int = readInt()
  val prod = a * b
  val even: Boolean = if (prod % 2 == 0) { true } else { false }
  if (even) {
    println("even")
  } else {
    println("odd")
  }
}


//object Hello extends App {
//  var a: Int = readInt()
//  var num: String = readLine()
//  var s: String = readLine()
//  var sum = a + num.split(" ")(0).toInt + num.split(" ")(1).toInt
//  println(sum + " " + s)
//}
