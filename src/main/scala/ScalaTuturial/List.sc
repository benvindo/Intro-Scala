
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