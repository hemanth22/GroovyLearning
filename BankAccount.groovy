class BankAccount {
	private balance
	
	BankAccount(openingBalance){
		balance = openingBalance
	}
	
	def void deposit(amount) {
		balance += amount
	}
	
	def void withdraw(amount) {
		balance -= amount
	}
	
	def getBalance() {
		// return balance 
	}
}
