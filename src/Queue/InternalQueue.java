package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InternalQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		queue.add(22);
		queue.add(50);
		queue.add(95);
		queue.add(17);
		queue.add(83);

		System.out.println(queue.remove());
		System.out.println(queue.remove());
	}
}
