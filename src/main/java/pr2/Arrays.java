package pr2;

import java.util.Scanner;

public class Arrays {

	public static void SortArray(int[] array) {
		boolean isSorted = false;

		while (!isSorted) {

			isSorted = true;

			for (int i = 0; i < array.length - 1; i++) {

				if (array[i] > array[i + 1]) {

					isSorted = false;

					int swap = array[i];
					array[i] = array[i + 1];
					array[i + 1] = swap;

				}

			}

		}

	}

	public static void ScanArray(int[] array) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter array: ");

		for (int i = 0; i < array.length; i++) {

			array[i] = scan.nextInt();

		}
	}

	public static void DivThree(int[] array) {
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 3 == 0) {

				System.out.println(" div 3: " + array[i]);

			}
		}
	}

	public static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (i > 0) {
				System.out.print(", ");
			}

			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {

		int[] array = new int[3];

		ScanArray(array);

		SortArray(array);

		DivThree(array);

		System.out.println("Sorted aray:");

		printArray(array);

	}

}
