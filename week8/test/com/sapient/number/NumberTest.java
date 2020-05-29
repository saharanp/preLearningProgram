package com.sapient.number;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberTest {
	
	@Test
	void checkPrimeReturnTrue() {
		assertEquals(true, Number.checkPrime(11));
	}
	
	@Test
	void checkPrimeReturnFalse() {
		assertEquals(false, Number.checkPrime(1));
	}
	
	@Test
	void checkPrimeShouldThrowException() {
		assertThrows(IllegalArgumentException.class, () ->{
			Number.checkPrime(-1);
		});
	}
	
	@Test
	void checkAmstrongReturnTrue() {
		assertEquals(true, Number.checkAmstrong(370));
	}
	
	@Test
	void checkAmstrongReturnFalse() {
		assertEquals(false, Number.checkAmstrong(234));
	}
	
	@Test
	void checkAmstrongShouldThrowException() {
		assertThrows(IllegalArgumentException.class, () ->{
			Number.checkAmstrong(-1);
		});
	}
	
	@Test
	void checkPolindromReturnTrue() {
		assertEquals(true, Number.checkPolindrom(121));
	}
	
	@Test
	void checkPolindromReturnFalse() {
		assertEquals(false, Number.checkPolindrom(357));
	}
	
	@Test
	void checkPolindromShouldThrowException() {
		assertThrows(IllegalArgumentException.class, () ->{
			Number.checkPolindrom(-1);
		});
	}
	
}

