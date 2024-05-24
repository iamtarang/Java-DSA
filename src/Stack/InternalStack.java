package Stack;

import java.util.Stack;

public class InternalStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		stack.push(34);
		stack.push(22);
		stack.push(94);
		stack.push(67);
		stack.push(-26);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
