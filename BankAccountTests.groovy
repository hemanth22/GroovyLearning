import groovy.util.GroovyTestCase

class BankAccountTests extends GroovyTestCase {

	def void testCanDepositMoney() {
	    def account = new BankAccount(10)
	    account.deposit(5)
	    assert 25 == account.balance
	}

}
