package Search.BinarySearch;

public class RotationCount {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 1, 2, 3 };
		System.out.println((countRotations(arr) + 1));
	}

	private static int countRotations(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			// * if elementss at middle, start and end are equal, then skip the duplicates
			if (arr[start] >= arr[mid] && arr[start] == arr[end]) {
				// * skip the duplicates
				// ? What if start and end were pivot ?

				// * Check if start is the pivot
				if (arr[start] > arr[start + 1]) {
					return start;
				}
				start++;

				// * Check if end is the pivot
				if (arr[end] > arr[end - 1]) {
					return end;
				}
				end--;
			} else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}
}
