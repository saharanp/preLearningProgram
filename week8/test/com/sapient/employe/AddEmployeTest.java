package com.sapient.employe;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddEmployeTest {
	
	private AddEmploye ob;
	
	@BeforeEach
	void setup() {
		ob = new AddEmploye();
	}

	@Test
	void addEmployeSuccess() {
		Employe emp = new Employe(2,"EF","FGB");
		ob.addEmploye(emp);
		assertTrue(ob.list.contains(emp));
	}
	
	@Test
	void addEmployeThrowsException() {	
		assertThrows(IllegalArgumentException.class,() -> {
			ob.addEmploye(null);
		});
	}
	
	@Test
	void getEmployeFound() {
		Employe emp = new Employe(1,"wdwfg","sdfvgb");
		assertEquals(emp,ob.getEmploye(101));
	}
	
	@Test
	void getEmployeNotFound() {
		ob.getEmploye(2);
		assertEquals(null,ob.getEmploye(2));
	}
	
	
	
	@AfterEach
	void tearDown() {
		ob = null;
	}

}
