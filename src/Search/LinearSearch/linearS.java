package Search.LinearSearch;

import java.util.Arrays;

public class linearS {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6, 77, 53, -1 };

		System.out.println(Arrays.toString(arr));
		int hit = linearSearch2(arr, 0);
		System.out.println(hit);
	}

	//* Returning the index
	static int linearSearch(int[] arr, int target){
		if(arr.length == 0){
			return -1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target){
				return i;
			}
		}
		return -1;
	}
	
	//* Returning the element itself
	static int linearSearch2(int[] arr, int target){
		if(arr.length == 0){
			return Integer.MIN_VALUE;
		}
		
		for(int element : arr) {
			if(element == target){
				return element;
			}
		}

		return Integer.MAX_VALUE;
	}

	//* Returning true or false
	static boolean linearSearch3(int[] arr, int target){
		if(arr.length == 0){
			return false;
		}

		for(int element : arr) {
			if(element == target){
				return true;
			}
		}
		return false;
	}
}
