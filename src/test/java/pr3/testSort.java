package pr3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pr2.Arrays;

public class testSort {
	
	private static Sort arr = new Sort();
	
	
	@Test 
	public  void testSortArray() {
		
		int [] array  = new int [] {2,176,3123};
		
		
		
		 arr.SortArray(array);
		 
		 int[] expected = new int [] {1,2,3};
		
		 assertEquals(2,array[0]);
		 assertEquals(176,array[1]);
		 assertEquals(3123,array[2]);
		
		
		
	
	}

}
