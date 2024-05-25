package Queue;

public class Main {
	public static void main(String[] args) {
		CustomQueue queue = new CustomQueue(5);

		queue.insert(34);
		queue.insert(22);
		queue.insert(94);
		queue.insert(67);
		queue.insert(-26);

		queue.display();

	}
}
