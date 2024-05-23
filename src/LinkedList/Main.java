package LinkedList;

public class Main {
	public static void main(String[] args) {
		SinglyLL singleLl = new SinglyLL();
		DoublyLL doublyLL = new DoublyLL();
		// singleLl.insertFirst(3);
		// singleLl.insertFirst(86);
		// singleLl.insertFirst(15);
		// singleLl.insertFirst(74);

		// singleLl.insertLast(99);
		// singleLl.insertLast(103);

		// singleLl.insertInMid(22, 2);
		// singleLl.insertInMid(58, 4);

		// singleLl.display();

		// singleLl.deleteFirst();
		// singleLl.display();

		// singleLl.deleteLast();
		// singleLl.display();

		// singleLl.deleteFromMid(4);
		// singleLl.display();

		doublyLL.insertFirst(3);
		doublyLL.insertFirst(86);
		doublyLL.insertFirst(15);
		doublyLL.insertFirst(74);
		
		doublyLL.insertLast(99);
		doublyLL.insertLast(10);

		doublyLL.insertInMid(86, 8);

		doublyLL.display();
	}
}
