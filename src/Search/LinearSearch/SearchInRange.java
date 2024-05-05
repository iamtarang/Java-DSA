package Search.LinearSearch;

import java.util.Arrays;

public class SearchInRange {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6, 77, 53, -1 };

		System.out.println(Arrays.toString(arr));
		int hit = linearSearch(arr, 0, 2, 4);
		System.out.println(hit);
	}

	//* Returning the index
	static int linearSearch(int[] arr, int target, int start, int end) {
		if (arr.length == 0) {
			return -1;
		}

		for (int i = start; i < end; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}