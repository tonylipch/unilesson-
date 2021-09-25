package pr2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestArrays {

	private static Arrays arr = new Arrays();

	@Test
	public void testSortArray() {

		int[] sar = new int[] { 2, 1, 3 };

		arr.SortArray(sar);

		int[] expected = new int[] { 1, 2, 3 };

		assertEquals(1, sar[0]);
		assertEquals(2, sar[1]);
		assertEquals(3, sar[2]);

	}

	@Test
	public void testDivThree() {

		int[] sar = new int[] { 2, 1, 3, 9, 27, 18 };

		arr.DivThree(sar);

		assertEquals(3, sar[2]);
		assertEquals(9, sar[3]);
		assertEquals(27, sar[4]);
		assertEquals(18, sar[5]);

	}

	@Test
	public void testDivThreeT() {

		int[] sar = new int[] {2, 4, 8, 16 };
		
		for (int i = 0 ; i< sar.length; i++) {
		
		arr.DivThree(sar);
		
		if (sar[i]%3==0) {
			
			System.out.print("IS DIV 3 "+sar[i]);
			
		} else 
		
		System.out.println("There is nobody div 3");
		break;
		
		}

		
		

	}

}
