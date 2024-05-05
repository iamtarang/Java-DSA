package Arrays;

import java.util.Arrays;

public class MaxItem {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6, 77, 53 };

		System.out.println(Arrays.toString(arr));
		int maxItem = max(arr);
		System.out.println(maxItem);
	}

	static int max(int[] arr){
		int max = 0;
		for (int i = 0; i < arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}

		return max;
	}
}
