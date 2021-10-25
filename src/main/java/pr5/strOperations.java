package pr5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class strOperations {

	public static String InsertLetter(String x) throws IOException {
		

		ByteArrayOutputStream newString = new ByteArrayOutputStream();

		byte[] splitoByte = x.getBytes();

		for (int i = 0; i < splitoByte.length; i++) {

			newString.write(splitoByte[i]);

			if (splitoByte[i] == 's') {

				newString.write('f');

			}

			newString.close();

		}
		System.out.println(newString.toString());

		return newString.toString();

	}

	public static void main(String[] args) throws IOException {
		
		String str = "Tests";
		
		
		InsertLetter(str);
		

	}

}
