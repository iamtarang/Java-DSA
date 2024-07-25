package Recursion;

public class Factorial {
	public static void main(String[] args) {
		int ans = fac(5);
		System.out.println(ans);
	}

	static int fac(int num) {
		if (num <= 1) {
			return 1;
		}
		return num * fac(num - 1);
	}
}
