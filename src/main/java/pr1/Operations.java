package pr1;

import java.io.IOException;

public class Operations {

	public int sum(int a, int b) {
		
		try {

		return a + b;
		
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			
			return a+b;
		}

	}

	public int muleq(int a) {

		int c = 2;

		return c *= a;

	}

	public double div(double a, double b) {

		return a / b;
	}

	public byte rshift(byte val) {
		return (byte) (val >> 2);
	}

	public byte zshift(byte val) {

		return (byte) (val >>> 2);
	}

	public int rel(int a, int b) {

		if (a >= b) {

			return a + b;

		} else {

			return a * b;
		}
	}

	public int or(int a, int b) {

		return a | b;
	}

	public int land(int a, int b) {

		if (a > 2 && b < 10) {

			return a + b;

		} else {
			return a * b;
		}

	}

	public int associativityF(int a, int b, int c) {

		return a * b * c;
	}

	public int associativityS(int a, int b, int c) {

		return a * (b + c);
	}

	public int associativityTh(int a, int b, int c) {

		return (a + c) * (b - a);

	}

	public int associativityFourth(int a, int b, int c) {

		return a * b / c + a;

	}

	public int associativityFifth(int a, int b, int c) {

		return (a + c) * (a * b) / 7;
	}

	public boolean noteq(int a, int b) {

		if (a != b) {

			return true;
		} else {
			return false;
		}
	}

	
	public static void main(String[] args) throws IOException {
		
		Operations o = new Operations();

		System.out.println("+ : " + o.sum(12, 5));

		System.out.println("/ : " + o.div(8.4, 4.2));

		System.out.println("*= : " + o.muleq(8));
		

		System.out.println(">> : " + o.rshift((byte) 00111100));

		System.out.println(">>> : " + o.zshift((byte) 00111100));
		

		System.out.println(">= : " + o.rel(2, 4));

		System.out.println("| : " + o.or(277, 432));

		System.out.println("&& : " + o.land(3, 5));

		System.out.println("!= : " + o.noteq(1, 21));

		System.out.println("associativity1: " + o.associativityF(12, 3, 1));
		System.out.println("associativity2: " + o.associativityS(24, 6, 8));
		System.out.println("associativity3: " + o.associativityTh(2, 4, 8));
		System.out.println("associativity4: " + o.associativityFourth(12, 24, 6));
		System.out.println("associativity5: " + o.associativityFifth(3, 12, 18));
	}
}
