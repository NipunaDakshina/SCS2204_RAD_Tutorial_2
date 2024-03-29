
object MyClass {
    
class Account(acc: String, bal: Double) {
  var accountNo = acc
  var balance = bal

  def withdraw(amount: Double) = balance = balance - amount

  def deposit(amount: Double) = balance = balance + amount

  def transfer(amount: Double, toAccount: Account) = {
    balance = balance - amount
    toAccount.balance = toAccount.balance + amount
  }

  def isNegativeBalance() = if (balance < 0) true else false

  def addInterest(depositRate: Double, overdraftRate: Double) = balance = balance * (1 + (if(isNegativeBalance()) overdraftRate else depositRate))

  override def toString = "\nAccount : " + accountNo + "\nBalance : " + balance
}

    def main(args: Array[String]) {
          val account_1 =new Account("001", 1000.0)
          val account_2 =new Account("002", 2000.0)
        
          println("\n-------------------------------------------------------------------------")
          println("Accounts : ")
          println(account_1)
          println(account_2)
        
          println("\n-------------------------------------------------------------------------")
          println("Transfer 500.00 to account 002")
          account_1.transfer(500.0, account_2)
        
          println("\n-------------------------------------------------------------------------")
          println("After transfer : ")
          println(account_1)
          println(account_2)
    }
}