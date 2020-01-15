package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorUnitCase {

	@Test
	public void testAddition() {
//		assertTrue(Calculator.Addition(10, 10) == 20);
		assertFalse(Calculator.Addition(10, 10) != 20);
	}

	@Test
	public void testSubstraction() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiplication() {
		fail("Not yet implemented");
	}

}
