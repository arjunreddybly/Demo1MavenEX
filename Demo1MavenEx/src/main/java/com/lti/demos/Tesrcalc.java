package com.lti.demos;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
 class Tesrcalc {
	/*
	@Test
	void test() {
		fail("Not yet implemented");
	}
*/
	Calculator c = new Calculator();
	@Test
	public void testHello()
	@Test
	void testAssertFalse() {
	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");
	}
}