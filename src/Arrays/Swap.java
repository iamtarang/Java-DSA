package Arrays;

import java.util.Arrays;

class Swap {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6, 77, 53 };

		System.out.println(Arrays.toString(arr));
		swap(arr, 1, 4);
		System.out.println(Arrays.toString(arr));
	}

	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}