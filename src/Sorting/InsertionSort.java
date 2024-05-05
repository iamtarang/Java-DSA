package Sorting;

import java.util.Arrays;

/*

*	will traverse elements from index-1 and compare it with all the element to 
*	its left and change the index accordingly

*	Adaptive: steps are reduced as compared to bubble sort
*	Used for smaller arrays
*	Works good on partially sorted arrays
*	Useful in hybrid sort algorithms

!	Space Complexity: O(1):
::	Inplace Algorithm
::	Stable Sorting Algorithm

!	Time Complexity: n => Number of comparisons.
::	Best Case: O(n)
::	Worst Case: O(n²)

*/

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 5, 4, -3, -4, 1, 2, 3, 0 };
		insertion(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void insertion(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println("arr[i]: " + arr[i]);
			for (int j = i + 1; j > 0; j--) {
				System.out.println("arr[j]: " + arr[j]);
				System.out.println("arr[j - 1]: " + arr[j - 1] + "\n");
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
