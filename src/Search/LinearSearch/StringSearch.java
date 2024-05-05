package Search.LinearSearch;

import java.util.Arrays;

public class StringSearch {
	public static void main(String[] args) {
		String name = "tarang";
		char target = 'g';
	
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(search2(name, target));
	}

	static boolean search(String str, char target){
		if(str.length() == 0){
			return false;
		}

		for (int i = 0; i < str.length(); i++) {
			if(target == str.charAt(i)){
				return true;
			}
		}

		return false;
	}
	
	//* foreach
	static boolean search2(String str, char target){
		if(str.length() == 0){
			return false;
		}

		for (char ele : str.toCharArray()) {
			if(ele == target){
				return true;
			}
		}

		return false;
	}
}
