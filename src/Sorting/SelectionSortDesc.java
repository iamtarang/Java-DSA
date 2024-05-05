package Sorting;

import java.util.Arrays;

/*

*	Selects the element and puts it in the correct index.
*	Finds the max in the array (n-1 comparisons)
*	Useful for smaller arrays

!	Space Complexity: O(1):
::	Inplace Algorithm
::	Not Stable Sorting Algorithm

!	Time Complexity: n => Number of comparisons.
::	Best Case: O(n²)
::	Worst Case: O(n²)

*/

public class SelectionSortDesc {
	public static void main(String[] args) {
		int[] arr = { 5, -4, 4, 1, 2, 3, 0 };
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void selection(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int last = arr.length - i - 1;
			int maxIndex = getMaxIndex(arr, 0, last);

			swap(arr, maxIndex, last);
		}
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	static int getMaxIndex(int[] arr, int start, int end) {
		int max = start;

		for (int i = start; i < end; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			}
		}
		return max;
	}
}
