package Stack;

public class Main {
	public static void main(String[] args) throws StackException {
		CustomStack stack = new CustomStack();

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
