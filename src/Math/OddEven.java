package Math;

public class OddEven {
	public static void main(String[] args) {

		int num1 = 23;
		int num2 = 20;

		System.out.println(isOdd(num1));
		System.out.println(isOdd(num2));
	}

	static boolean isOdd(int i) {
		return (i & 1) == 1;
	}
}