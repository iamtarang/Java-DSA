package Search.BinarySearch;

public class FindElementInInfiniteArray {

	public static void main(String[] args) {
		int[] arr = { -20, -16, -5, -2, 0, 3, 14, 26, 30, 44, 94 };
		int target = 26;

		System.out.println(ans(arr, target));
	}

	static int ans(int[] arr, int target) {
		int start = 0;
		int end = 1;

		while (end < arr.length && target > arr[end]) {
			int temp = end + 1;
			end = end + (end - start + 1) * 2;
			start = temp;
		}

		// Ensure end does not exceed the length of the array
		if (end >= arr.length) {
			end = arr.length - 1;
		}

		return binarySearch(arr, target, start, end);
	}

	static int binarySearch(int[] arr, int target, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}
}
