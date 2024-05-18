package LinkedList;

public class Main {
	public static void main(String[] args) {
		SinglyLL singleLl = new SinglyLL();

		singleLl.insertFirst(3);
		singleLl.insertFirst(86);
		singleLl.insertFirst(15);

		singleLl.insertFirst(74);
		singleLl.insertLast(99);
		singleLl.insertLast(103);

		singleLl.insertInMid(22, 2);
		singleLl.insertInMid(58, 4);

		singleLl.display();

		singleLl.deleteFirst();
		singleLl.display();

		singleLl.deleteLast();
		singleLl.display();

		singleLl.deleteFromMid(4);
		singleLl.display();
	}
}
