import groovy.util.GroovyTestCase

class BankAccountTests extends GroovyTestCase {

	private account
	def void setUp() {
	    account = new BankAccount(10)
	    //println 'in setup'
	}
	
	def void tearDown() {
	    account = null
	    //account = new BankAccount(25)
	    //println 'in teardown'
	}

	def void testCanDepositMoney() {
	    // def account = new BankAccount(10)
	    account.deposit(5)
	    assert 15 == account.balance
	}
	
	def void testCanWithdrawMoney() {
            // def account = new BankAccount(25)
            account.withdraw(5)
            assert 5 == account.balance
	}

}
