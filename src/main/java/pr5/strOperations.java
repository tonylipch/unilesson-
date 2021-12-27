package pr5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class strOperations {

	public static String InsertLetter(String x,char y, char z) throws IOException {
		
		
		
	
		
		ByteArrayOutputStream newString = new ByteArrayOutputStream();

		byte[] splitoByte = x.getBytes();
		


		for (int i = 0; i < splitoByte.length; i++) {

			newString.write(splitoByte[i]);

			if (splitoByte[i] == y) {

				newString.write(z);

			}

			newString.close();

		}
		System.out.println(newString.toString());

		return newString.toString();

	}

	public static void main(String[] args) throws IOException {
		

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter word");
		String str = scan.next();
		
		
		System.out.println("X: ");
	    char x = scan.next().charAt(0);
		System.out.println("Y: ");
		char y = scan.next().charAt(0);
		
		
		InsertLetter(str,x,y);
		

	}

}
