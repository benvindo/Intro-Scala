
val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
val empty = Nil


val nums2 = 1 :: 2 :: 3 :: 4 :: Nil
val nums3 = Nil.::(4).::(3).::(2).::(1)

nums match {
  // Lists of `Int` that starts with `1` and then `2`
  case 1 :: 2 :: xs =>  1 :: 2 :: 3 :: 4 :: Nil
  // Lists of length 1
  case x :: Nil =>  1 :: 2 :: 3 :: 4 :: Nil
  // Same as `x :: Nil`
  case List(x) =>  1 :: 2 :: 3 :: 4 :: Nil
  // The empty list, same as `Nil`
  case List() =>
  // A list that contains as only element another list that starts with `2`
  //case List(2 :: xs) => List(1, 2, 3, 4)
}


List(1, 2, 3).map(x => x + 1) == List(2, 3, 4)

List(1, 2, 3).filter(x => x % 2 == 0) == List(2)


val xs =
  List(1, 2, 3).flatMap { x =>
    List(x, 2 * x, 3 * x)
  }
xs == List(1, 2, 3, 2, 4, 6, 3, 6, 9)

Some(1).map(x => x + 1)

None.map((x: Int) => x + 1)

Option(1).map(x => x + 1)

Some(1).filter(x => x % 2 == 0)

Some(2).filter(x => x % 2 == 0)

Some(4).filter(x => x % 2 == 0)

Some(1).flatMap(x => Some(x + 1))
None.flatMap((x: Int) => Some(x + 1))

Option(1).flatMap(x => Some(x + 1))

def triple(x: Int): Int = 3 * x

def tripleEither(x: Either[String, Int]): Either[String, Int] =
  x.right.map(triple)

tripleEither(Right(1))

tripleEither(Left("not a number"))

val x: Int = 1
x :: xs.to[List]
(xs.size + 1)
(x :: xs.to[List]).sum.toDouble /(xs.size + 1)



