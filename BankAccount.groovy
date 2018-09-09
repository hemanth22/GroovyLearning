class BankAccount {
	private balance
	
	BankAccount(openingBalance){
		balance = openingBalance
	}
	
	def void deposit(amount) {
		balance += amount
	}
	
	def void withdraw(amount) {
	    if (amount > balance)
			throw new InsufficientFundsException()

		balance -= amount
	}	
	
	def void accrueInterest() {
		def service = new InterestRateService()
                def rate = service.getInterestRate()
	        //	def rate = 0.10
		// example: 50 = 500 * 0.10
		def accruedInterest = balance * rate

		deposit(accruedInterest)
	}
}
