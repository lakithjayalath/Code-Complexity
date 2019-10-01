package TestClasses;
import static org.junit.Assert.*;

import java.io.IOException;

import ComplexityFunctions.CtcComplex;

public class Test {

	@org.junit.Test
	public void test() throws IOException {
		CtcComplex x = new CtcComplex();
		
		int expected = 11 ;
		int actual = x.totalWeight();
		assertEquals(expected, actual);	
	}

}
