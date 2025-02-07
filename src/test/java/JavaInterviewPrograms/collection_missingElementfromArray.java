package JavaInterviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class collection_missingElementfromArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 6, 7, 9, 10 };

		// Find the range of numbers from the smallest to largest
		int min = arr[0];
		int max = arr[arr.length - 1];

		// List to store missing numbers
		List<Integer> missingNumbers = new ArrayList<Integer>();

		// Loop through the range of numbers
		for (int i = min; i <= max; i++) {
			// Check if the number is not in the original array
			if (!contains(arr, i)) {
				missingNumbers.add(i);
			}
		}

		// Output the result
		System.out.println(missingNumbers);
	}

	// Helper method to check if an element is in the array
	private static boolean contains(int[] arr, int num) {
		for (int i : arr) {
			if (i == num) {
				return true;
			}
		}
		return false;
	}
}
