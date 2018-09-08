import groovy.util.GroovyTestCase

class BankAccountTests extends GroovyTestCase {

	def void setUp() {
	    println 'in setup'
	}
	
	def void tearDown() {
	    println 'in teardown'
	}

	def void testCanDepositMoney() {
	    def account = new BankAccount(10)
	    account.deposit(5)
	    assert 15 == account.balance
	}
	
	def void testCanWithdrawMoney() {
            def account = new BankAccount(25)
            account.withdraw(5)
            assert 20 == account.balance
	}

}
