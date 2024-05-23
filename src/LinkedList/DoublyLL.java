package LinkedList;

public class DoublyLL {

	private Node head;

	// * For inserting a new value at the beginning of the LL
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		node.prev = null;

		if (head != null) {
			head.prev = node;
		}
		head = node;
	}

	// * For inserting a new value at the end of the LL
	public void insertLast(int val) {
		Node node = new Node(val);
		Node last = head;

		node.next = null;

		if (head == null) {
			node.prev = null;
			head = node;
			return;
		}

		while (last.next != null) {
			last = last.next;
		}

		last.next = node;
		node.prev = last;
	}

	// * For finding the index by value
	public Node findNode(int value) {
		Node node = head;
		while (node != null) {
			if (node.value == value) {
				return node;
			}
			node = node.next;
		}
		return null;
	}

	// * For inserting in mid
	public void insertInMid(int after, int val) {
		Node p = findNode(after);

		if (p == null) {
			System.out.println("does not exist");
			return;
		}

		Node node = new Node(val);
		node.next = p.next;
		p.next = node;
		node.prev = p;
		
		if (node.next != null) {
			node.next.prev = node;
		}
	}

	// * For displaying the LL
	public void display() {
		Node temp = head;
		Node last = null;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			last = temp;
			temp = temp.next;
		}
		System.out.println("END");

		System.out.println("Print in reverse");
		while (last != null) {
			System.out.print(last.value + " <- ");
			last = last.prev;
		}
		System.out.println("START");
	}

	// ! For creating and new Node and setting pointers
	private class Node {
		private int value;
		private Node next;
		private Node prev;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next, Node prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
	}
}
