package Recursion;

public class skipString {
	public static void main(String[] args) {
		System.out.println(skipChar("bacafappledhapple"));
		System.out.println(skipApple("bacafappledhapple"));
		System.out.println(skipAppNotApple("bacafappledhapp"));
	}



	private static String skipChar(String up) {
		if (up.isEmpty()) {
			return "";
		}

		char ch = up.charAt(0);

		if (ch == 'a') {
			return skipChar(up.substring(1));
		} else {
			return ch + skipChar(up.substring(1));
		}
	}
	
	private static String skipApple(String up) {
		if (up.isEmpty()) {
			return "";
		}

		if (up.startsWith("apple")) {
			return skipApple(up.substring(5));
		} else {
			return up.charAt(0) + skipApple(up.substring(1));
		}
	}
	
	private static String skipAppNotApple(String up) {
		if (up.isEmpty()) {
			return "";
		}

		if (up.startsWith("app") && !up.startsWith("apple")) {
			return skipAppNotApple(up.substring(3));
		} else {
			return up.charAt(0) + skipAppNotApple(up.substring(1));
		}
	}
}
