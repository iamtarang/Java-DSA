package Search.BinarySearch;

public class RotatedDuplicateBS {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1 };
		int ans = search(arr, 2);
		System.out.println(ans);
	}

	static int search(int[] nums, int target) {
		int pivot = findPivot(nums);

		// * if pivot is not found, array is not rotated

		if (pivot == -1) {
			// * do normal binary search
			return binarySearch(nums, target, 0, nums.length - 1);
		}

		// * if pivot is found, we have 2 ascending sorted arrays
		if (nums[pivot] == target) {
			return pivot;
		}
		if (target >= nums[0]) {
			return binarySearch(nums, target, 0, pivot - 1);
		}
		return binarySearch(nums, target, pivot + 1, nums.length - 1);
	}

	static int binarySearch(int[] arr, int target, int start, int end) {
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

	static int findPivot(int[] arr) {
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
