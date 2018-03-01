def add(a: Int)(b: Int) = a + b

val onePlusFive = add(1)(5) // 6

val addFour = add(4)_ // (Int => Int)

val twoPlusFour = addFour(2) // 6

assert(onePlusFive == twoPlusFour) // true

onePlusFive == twoPlusFour
