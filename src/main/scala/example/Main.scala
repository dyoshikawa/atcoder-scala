package example

import scala.io.StdIn._

object Main extends App {
  val nums: Array[Int] = readLine().split(" ").map(_.toInt)
  val sum: Int = nums(0) + nums(1)
  if (sum % 2 == 0) {
    println(sum / 2)
  } else {
    println(sum / 2 + 1)
  }
}

// ABC 088 A - Infinite Coins
//object Main extends App {
//  val N: Int = readInt()
//  val A: Int = readInt()
//
//  val div : Int = N / 500
//  if ((N - 500 * div) > 1 * A) {
//    println("No")
//  } else {
//    println("Yes")
//  }
//}

// A - RGB Cards
//object Main extends App {
//  val num: Int = readLine().replace(" ", "").toInt
//  if (num % 4 == 0) {˚
//    println("YES")
//  } else {
//    println("NO")
//  }
//}

// ABC 087 B - Coins
//object Main extends App {
//  val nums: Array[Int] = readLine().split(" ").map(_.toInt)
//  val A: Int = nums(0)
//  val B: Int = nums(1)
//  val C: Int = nums(2)
//  val X: Int = readInt()
//
//  var res: Int = 0
//  for (a <- 0 to A) {
//    for (b <- 0 to B) {
//      for (c <- 0 to C) {
//        if ((500 * a + 100 * b + 50 * c) == X) {
//          res += 1
//        }
//      }
//    }
//  }
//  println(res)
//}

// ABC 081 B - Shift Only
//object Hello extends App {
//  readLine()
//  val str: String = readLine()
//  var nums: Array[Int] = str.split(" ").map(_.toInt)
//  var res: Int = 0
//
//  var loop: Boolean = true
//  while(loop) {
//    if (nums.count(_ % 2 != 0) > 0) {
//      loop = false
//    } else {
//      nums = nums.map(_ / 2)
//      res += 1
//    }
//  }
//
//  println(res)
//}

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
