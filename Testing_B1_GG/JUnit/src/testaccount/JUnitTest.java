package testaccount;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitTest {

	Account a = null;
	
	//for every execution of the test method, new setUp() and tearDown() functions are executed
	
	@Before
	public void setUp() throws Exception {
		a = new Account("1","a",3000);
		System.out.println("Before the test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After the test");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testWithdraw() {
		a.withdraw(300);
		assertEquals(2699, a.getBalance(),1);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testDeposit() {
		a.deposit(300);
		assertEquals(3300, a.getBalance(),0);
	}
	
	@Test
	public void testInterest()
	{
		a.applyInterest();
		assertEquals(3210, a.getBalance(),0);
	}
}
