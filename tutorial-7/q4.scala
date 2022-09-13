
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

    def main(args:Array[String]){
         var accounts: List[Account] =List(
         new Account("001", -1000.0),
         new Account("002", 2000.0),
         new Account("003", 3000.0)
        )
        
          println("\n-------------------------------------------------------------------------")
          println("List of Accounts with negative balances : ")
          val negativeBalances = accounts.filter(account => account.isNegativeBalance())
          negativeBalances.map(account => println(account))
        
          println("\n-------------------------------------------------------------------------")
          println("The sum of all account balances : ")
          val total = accounts.reduce((x, y) => new Account("-TOTAL-", x.balance + y.balance))
          println(total)
        
          println("\n-------------------------------------------------------------------------")
          println("The final balances of all accounts after apply the interest : ")
          accounts.map(account => account.addInterest(0.05, 0.1))
          accounts.map(account => println(account))
    }

}