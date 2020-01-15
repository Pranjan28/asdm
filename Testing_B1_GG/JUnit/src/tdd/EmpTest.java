package tdd;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.Month;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//Test driven development(TDD)
//emp-->name(not null, not exceeding beyond 40 char), dateofjoining(not null, not greater than today, not be lesser than 18yrs in the past)

public class EmpTest {

	Emp e = null;

	@Before
	public void setUp() throws Exception {
		System.out.println("Inside the setUp");
		e = new Emp();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Inside the tearDown");
	}

	/*
	 * @Test public void testNameNull() { // fail("Not yet implemented");
	 * e.acceptName(); assertNotNull(e.getName()); }
	 */

	/*
	 * @Test public void testNameLength() { e.acceptName();
	 * assertTrue(e.getName().length() > 10); assertTrue(e.getName().length() < 25);
	 * }
	 */

	/*
	 * @Test public void testDateNull() { e.acceptDoj(); assertNotNull(e.getDoj());
	 * }
	 */

	/*
	 * @Test public void testDateGreater() { e.acceptDoj();
	 * assertTrue(LocalDate.now().isAfter(e.getDoj())); }
	 */

	@Test
	public void testdateBefore() {
		e.acceptDoj();
		assertTrue(e.getDoj().isBefore(LocalDate.now().minusYears(18)));
	}

}
