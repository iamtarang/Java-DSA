package Trees;

public class AVL {
	public class Node {
		private int value;
		private int height;
		private Node left;
		private Node right;

		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	private Node root;

	public AVL() {
	}

	public int height(Node node) {
		if (node == null) {
			return -1;
		}
		return node.height;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void insert(int value) {
		root = insert(value, root);
	}

	private Node insert(int value, Node node) {
		if (node == null) {
			node = new Node(value);
			return node;
		}

		if (value < node.value) {
			node.left = insert(value, node.left);
		}

		if (value > node.value) {
			node.right = insert(value, node.right);
		}

		node.height = Math.max(height(node.left), height(node.right)) + 1;

		return rotate(node);
	}

	private Node rotate(Node node) {

		// * left heavy
		if (height(node.left) - height(node.right) > 1) {
			// * left left case
			if (height(node.left.left) - height(node.left.right) > 0) {
				return rightRotate(node);
			}
			// * left right case
			if (height(node.left.left) - height(node.left.right) < 0) {
				node.left = leftRotate(node.left);
				return rightRotate(node);
			}
		}

		// * right heavy
		if (height(node.left) - height(node.right) < -1) {
			// * right right case
			if (height(node.right.left) - height(node.right.right) < 0) {
				return leftRotate(node);
			}
			// * right left case
			if (height(node.right.left) - height(node.right.right) > 0) {
				node.left = rightRotate(node.left);
				return leftRotate(node);
			}
		}
		return node;
	}

	private Node leftRotate(Node C) {
		Node P = C.right;
		Node T = P.left;

		P.left = C;
		C.right = T;

		P.height = Math.max(height(P.left), height(P.right) + 1);
		P.height = Math.max(height(C.left), height(C.right) + 1);

		return P;
	}

	private Node rightRotate(Node P) {
		Node C = P.left;
		Node T = C.right;

		C.right = P;
		P.left = T;

		P.height = Math.max(height(P.left), height(P.right) + 1);
		P.height = Math.max(height(C.left), height(C.right) + 1);

		return C;
	}

	public void populate(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			this.insert(nums[i]);
		}
	}

	public void populatedSorted(int[] nums) {
		populatedSorted(nums, 0, nums.length);
	}

	private void populatedSorted(int[] nums, int start, int end) {
		if (start >= end) {
			return;
		}

		int mid = (start + end) / 2;

		this.insert(nums[mid]);

		populatedSorted(nums, start, mid);
		populatedSorted(nums, mid + 1, end);
	}

	public boolean balanced() {
		return balanced(root);
	}

	private boolean balanced(Node node) {
		if (node == null) {
			return true;
		}
		return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
	}

	public void display() {
		display(root, "Root Node: ");
	}

	private void display(Node node, String details) {
		if (node == null) {
			return;
		}
		System.out.println(details + node.value);

		display(node.left, "Left child of " + node.getValue() + " : ");
		display(node.right, "Right child of " + node.getValue() + " : ");
	}
}
