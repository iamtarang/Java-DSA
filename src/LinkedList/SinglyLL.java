package LinkedList;

public class SinglyLL {

	private Node head;
	private Node tail;
	private int size;

	public SinglyLL() {
		this.size = 0;
	}

	// ! For creating and new Node and setting pointers
	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

	// * For getting the value of a node by index
	public Node getNode(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
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

	// * For inserting a new value at the beginning of the LL
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}

		size += 1;
	}

	// * For inserting elements at the end of the linked list
	public void insertLast(int val) {

		if (tail == null) {
			insertFirst(val);
			return;
		}

		Node node = new Node(val);

		tail.next = node;
		tail = node;
		size++;
	}

	// * For inserting elements in middle of LL
	public void insertInMid(int val, int index) {
		if (index == 0) {
			insertFirst(val);
			return;
		}

		if (index == size) {
			insertLast(val);
			return;
		}

		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}

		Node node = new Node(val, temp.next);
		temp.next = node;

		size++;

	}

	// * Delete the items from the beginning
	public int deleteFirst() {
		int val = head.value;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		size--;
		return val;
	}

	// * Delete items from the end
	public int deleteLast() {
		if (size <= 1) {
			return deleteFirst();
		}

		Node secondLast = getNode(size - 2);
		int val = tail.value;
		tail = secondLast;
		tail.next = null;

		return val;
	}

	// * Delete items from middle
	public int deleteFromMid(int index) {
		if (index == 0) {
			return deleteFirst();
		}
		if (index == size - 1) {
			return deleteLast();
		}

		Node prev = getNode(index - 1);
		int val = prev.next.value;

		prev.next = prev.next.next;
		return val;
	}

	// * For displaying the LL
	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}
}