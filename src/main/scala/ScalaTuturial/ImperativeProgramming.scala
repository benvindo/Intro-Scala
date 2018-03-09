package ScalaTuturial

class BankAccount1 {
  private var balance = 0
  def deposit(amount: Int): Int = {
    if (amount > 0) balance = balance + amount
    balance
  }
  def withdraw(amount: Int): Int =
    if (0 < amount && amount <= balance) {
      balance = balance - amount
      balance
    } else throw new Error("insufficient funds")
}


object BankAccount1 extends App {

  val account = new BankAccount1 // account: BankAccount = BankAccount
  //account deposit 50 //
  //account withdraw 20 // res1: Int = 30
  //account.withdraw(20) // res2: Int = 10
  //account withdraw 15                 // java.lang.Error: insufficient funds

  val x = new BankAccount1
  val y = new BankAccount1

  println(x deposit 30)
  //println(y withdraw 20)                // java.lang.Error: insufficient funds

  def factorial(n: Int): Int = {
    var result =  1

    var i =  1

    while (i <= n) {
      result = result * i
      i = i + 1

    }
    result
  }

  println(factorial(5))
}

