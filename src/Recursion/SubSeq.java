package Recursion;

import java.util.ArrayList;

public class SubSeq {
	public static void main(String[] args) {
		System.out.println(subSeqArr("", "abc"));
	}

	static void subseq(String proc, String unproc) {
		if (unproc.isEmpty()) {
			System.out.println(proc);
			return;
		}

		char ch = unproc.charAt(0);

		subseq(proc + ch, unproc.substring(1));
		subseq(proc, unproc.substring(1));
	}

	static ArrayList<String> subSeqArr(String proc, String unproc) {
		if (unproc.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(proc);
			return list;
		}

		char ch = unproc.charAt(0);

		ArrayList<String> left = subSeqArr(proc + ch, unproc.substring(1));
		ArrayList<String> right = subSeqArr(proc, unproc.substring(1));

		left.addAll(right);
		return left;
	}
}
