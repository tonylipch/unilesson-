package pr3;

import java.util.Scanner;

public class Sort {
	
	
	
	public static void SortArray(int[] array) {
		boolean isSorted = false;

		while (!isSorted) {

			isSorted = true;

			for (int i = 0; i < array.length - 1; i++) {

				if (array[i] > array[i + 1]) {

					isSorted = false;

					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;

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
	
	public static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (i > 0) {
				System.out.print(", ");
			}

			System.out.print(arr[i]);
		}
	
	}
}

	

