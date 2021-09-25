package pr1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestOperations {

	private Operations operations = new Operations();

	@Test
	public void testSum() {

		int result = operations.sum(1, 2);

		assertEquals(3, result);

	}

	@Test
	public void testMulEq() {

		int result = operations.muleq(5);

		assertEquals(10, result);
	}

	@Test
	public void testDiv() {

		double result = operations.div(6, 3);

		assertEquals(2, 00001d, result);

	}

	@Test
	public void testRshift() {

		byte result = operations.rshift((byte) 00111100);

		assertEquals(16, result);

	}

	@Test
	public void testZshift() {
		byte result = operations.rshift((byte) 00111100);

		assertEquals(16, result);

	}
	

	@Test
	public void testRelAbiggerThanB() {

		int result = operations.rel(2, 1);

		assertEquals(3, result);

	}
	@Test
	public void testRelAequalB() {

		int result = operations.rel(2, 1);

		assertEquals(3, result);

	}
	
	@Test
	public void testRelAlessThanB() {

		int result = operations.rel(1, 2);

		assertEquals(2, result);

	}
	
	
	@Test 
	public void tesOr() {
		
		int result = operations.or(277, 432);
		
		assertEquals (437, result);
	}
	
	
	@Test
	public void testAbiggerAndBless () {
		
		int result = operations.land(12, 2);
		
		assertEquals(14,result);
	}
	
	@Test
	public void testAndElse () {
		
		int result = operations.land(1, 11);
		
		assertEquals(11,result);
	}
	
	@Test 
	public void testNotEQAB() {
		
		boolean result = operations.noteq(1, 2);
		
		assertEquals (true,result);
		
		
	}
	
	@Test 
	public void testEQAB() {  
		
		boolean result = operations.noteq(1, 1);
		
		assertEquals (false,result);
		
		
	}
	
	
	

	
	
	

}
