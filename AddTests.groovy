import groovy.util.GroovyTestCase

class AddTests extends GroovyTestCase {

def void testAdditions() {		
		def account = new Add();
		account.addition(10,20)
		assert 30 ==  account.addition()
	
	}

}
