package pr5;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class testInsertLetter {
	
	



	@Test
	public void  testStr() throws IOException{
		
		
		
	String res =	strOperations.InsertLetter("Tests",'s','f');
		
		assertEquals("Tesftsf", res);
		
	
		
	}
	
	
	

	
    
       

}
