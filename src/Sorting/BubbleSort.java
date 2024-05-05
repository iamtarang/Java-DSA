package Sorting;

import java.util.Arrays;

//? aka Sinking Sort and Exchange Sort
/*
*	Automatically sets the largest value to the end of array.
*	Hence, reducing the array size with every iteration will optimize it.

!	Space Complexity: O(1):
::	Inplace Algorithm, i.e., No extra space required (copying array, etc.)
::	Stable Sorting Algorithm, i.e., Order is same for same values

!	Time Complexity: n => Number of comparisons.
::	Best Case: O(n) => already sorted array
::	Worst Case: O(n²) => reverse sorted array

*/

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 2, 3, 0 };
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void bubble(int[] arr) {
		boolean swapped;
		// run the steps n-1 times
		for (int i = 0; i < arr.length; i++) {
			swapped = false;
			// for each step max will come at end
			for (int j = 1; j < arr.length - i; j++) {
				// Compare and swap
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;

					swapped = true;
				}
			}

			// ! if you didn't swap for a particular value of i, it means it rest of the array is sorted

			if (!swapped) { //* if swapped is false, break will occur.
				break;
			}
		}
	}
}
