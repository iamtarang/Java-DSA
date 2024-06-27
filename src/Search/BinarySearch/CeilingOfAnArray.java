package Search.BinarySearch;

public class CeilingOfAnArray {

	// * Ceiling
	// :: smallest element in array that is greater or equal to a target element
	public static void main(String[] args) {
		int[] arr = { -20, -16, -5, -2, 0, 3, 14, 26, 30, 44, 94 };
		int target = 28;

		int ceiling =  ceiling(arr, target);
		int floor =  floor(arr, target);

		System.out.println(ceiling);
		System.out.println(floor);
	}

	static int ceiling(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		if (target > arr[end]) return -1;

		while (start <= end) {

			// * finding the mid element

			// ! might exceed the range of integer
			// ? int mid = (start + end) / 2;

			// * Hence
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}

		return arr[start];
	}

	static int floor(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		if (target < arr[start]) return -1;
		
		while (start <= end) {

			// * finding the mid element

			// ! might exceed the range of integer
			// ? int mid = (start + end) / 2;

			// * Hence
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}

		return arr[end];
	}
}