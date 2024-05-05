package Arrays;

import java.util.Arrays;

public class RevArr {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6, 77, 53 };

		System.out.println(Arrays.toString(arr));
		rev(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void rev(int arr[]) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
	}

	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
