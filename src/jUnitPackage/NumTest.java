package jUnitPackage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class NumTest {

	@Test
	public void test() {
		jUnitFunction junit = new jUnitFunction();
		int result=junit.addNumbers(5, 20);
		assertEquals(25, result);
	}

}
