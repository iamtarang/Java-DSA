package LinkedList;

public class Main {
	public static void main(String[] args) {
		SinglyLL singleLl = new SinglyLL();
		DoublyLL doublyLL = new DoublyLL();
		CircularLL circularLL = new CircularLL();

		// :: Singly LL operations
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

		// :: Doubly LL operations
		// doublyLL.insertFirst(3);
		// doublyLL.insertFirst(86);
		// doublyLL.insertFirst(15);
		// doublyLL.insertFirst(74);

		// doublyLL.insertLast(99);
		// doublyLL.insertLast(10);

		// doublyLL.insertInMid(86, 8);

		// doublyLL.display();

		// :: Circular LL operations
		circularLL.insert(45);
		circularLL.insert(2);
		circularLL.insert(03);
		circularLL.insert(18);
		circularLL.insert(88);

		circularLL.display();

		circularLL.delete(03);
		circularLL.display();
	}
}
