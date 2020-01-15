package com.app.core;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	Employee e;
	@Before
	public void setUp() throws Exception {
		e=new Employee("ID00000", "abc", -1000, "cokeandhookers", "pimperandginger", "roomservice", LocalDate.parse("2000-12-01"));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCheckID() {
		assertEquals(true,e.checkId(e.getId()));
	}
	@Test
	public void testCalSal() 
	{
		
		assertEquals(1500,e.calSal(),0);
	}
	@Test
	public void testNull() 
	{
		assertEquals(true,e.nameDept());
	}
	
	
}
