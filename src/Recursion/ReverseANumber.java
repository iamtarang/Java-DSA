package Recursion;

public class ReverseANumber {
	static int sum = 0;

	static void reverse(int n) {
		if (n == 0) {
			return;
		}
		int rem = n % 10;
		sum = sum * 10 + rem;
		reverse(n / 10);
	}
	
	static void reverse2(int n) {
		if (n == 0) {
			return;
		}
		int rem = n % 10;
		sum = sum * 10 + rem;
		reverse(n / 10);
	}

	static boolean palin(int n){
		return (n == sum);
	}

	public static void main(String[] args) {
		reverse(5335);
		System.out.println(sum);
		System.out.println(palin(5335));
	}

}
