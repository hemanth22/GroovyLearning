import groovy.util.GroovyTestCase

class AddTests extends GroovyTestCase {

def void testAdditions() {		
		def account = new Add();
		assert 30 ==  account.addition(20,10)
	
	}

}
