package Math;

public class UniqueNo {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 4, 5, 2, 3, 6, 4 };

		System.out.println(unique(arr));
	}

	static int unique(int[] arr) {
		int unique = 0;

		for (int i : arr) {
			unique ^= i;
		}

		return unique;
	}
}
