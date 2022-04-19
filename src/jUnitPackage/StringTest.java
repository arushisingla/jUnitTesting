package jUnitPackage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class StringTest {

	@Test
	public void test() {
		jUnitFunction junit = new jUnitFunction();
		String result=junit.addStrings("a", "b");
		assertEquals("ab", result);
	}

}
