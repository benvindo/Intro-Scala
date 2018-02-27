package Obj_Singleton

class IntPair(val x: Int, val y: Int)

object IntPair {
  import math.Ordering
  implicit def ipord: Ordering[IntPair] =
    Ordering.by(ip => (ip.x, ip.y))

}