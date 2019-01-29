package example

import scala.io.StdIn._

// ABC 081 B - Shift Only
object Hello extends App {
  readLine()
  val str: String = readLine()
  var nums: Array[Int] = str.split(" ").map(_.toInt)
  var res: Int = 0

  var loop: Boolean = true
  while(loop) {
    if (nums.count(_ % 2 != 0) > 0) {
      loop = false
    } else {
      nums = nums.map(_ / 2)
      res += 1
    }
  }

  println(res)
}

// ABC 081 A - Placing Marbles
//object Hello extends App {
//  val str: String = readLine()
//  val chars = str.split("")
//  println(chars.count(_ == "1"))
//}

// ABC 086 A - Product
//object Hello extends App {
//  val a: Int = readInt()
//  val b: Int = readInt()
//  val prod = a * b
//  val even: Boolean = if (prod % 2 == 0) { true } else { false }
//  if (even) {
//    println("even")
//  } else {
//    println("odd")
//  }
//}

//object Hello extends App {
//  var a: Int = readInt()
//  var num: String = readLine()
//  var s: String = readLine()
//  var sum = a + num.split(" ")(0).toInt + num.split(" ")(1).toInt
//  println(sum + " " + s)
//}
