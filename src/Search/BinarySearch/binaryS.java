package Search.BinarySearch;

public class binaryS {
	public static void main(String[] args) {
		int[] arr = { -20, -16, -5, -2, 0, 3, 14, 26, 30, 44, 94 };
		int target = 44;
		int ans = binarySearch(arr, target);
		System.out.println(ans);
	}

	// * return the index
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
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

		return -1;
	}
}
