import groovy.util.GroovyTestCase
class AddTest extends GroovyTestCase {
def void testAdditions() {		
		def account = new Add();
		assert 30 ==  account.addition(20,10)
	        assert 60 ==  account.addition(30,30)
	        assert 90 ==  account.addition(60,30)
	}
def void testAdds() {		
		def account = new Add();
	        assert 60 ==  account.addition(30,30)
	}
def void testAddis() {		
		def account = new Add();
	        assert 90 ==  account.addition(60,30)
	}
}
