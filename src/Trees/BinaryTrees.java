package Trees;

import java.util.Scanner;

// ? Complexity: O(log n)
// * Binary Search Tree: he left nodes are smaller and the right nodes are
// larger.
// :: They have 0, 1 or 2 children at each node

// * Used in:
// :: file systems, databases, network routing, complex math
// :: problems/expressions, decision trees, huffman coding[compression of files]
// :: in graphs and other DS

// * Unbalanced Binary Tress
// :: inefficient for sorted data
// :: Nodes are only on the left side or the right side.
// :: Complexity becomes O(n)

// * Terminologies:
// :: size: total nodes
// :: child and parent
// :: siblings
// :: degree: no. of children a node has (Can be 0, 1 or 2 only)
// :: edge (connector of two nodes)
// :: height: max edges between leaf node and finding node
// :: level: diff of height between f-node and root node
// :: ancestor and descendent

// * Types of BTs
// :: Complete BT: all levels are filled except the last (if it is, it is from L to R)
// :: Full BT/Strict BT: Every node has either 0 or 2 children only. (used in compression)
// :: Perfect BT: All the levels are filled along with the last level
// :: Height Balanced BT: Average height is O(log n)
// :: Skewed BT: Every node has only 1 child
// :: Ordered BT: Every node follows some property or condition (eg. BST)

// *  Properties
// :: In Perfect BT, with height: h, total nodes = 2^(n+1) - 1
// :: In Perfect BT, with height: h, total leaf nodes = 2^h
// :: In Perfect BT, with height: h, total internal nodes = 2^(n+1) - 1 - 2^h 
// :: If n = no. of levels, levels = log(n+1)
// :: In strict BT, if leaf nodes = n, internal nodes = n - 1. [LF = IN + 1]

public class BinaryTrees {

	public BinaryTrees() {

	}

	private static class Node {
		int value;
		Node left;
		Node right;

		public Node(int value) {
			this.value = value;
		}
	}

	private Node root;

	// * Insert elements
	public void populate(Scanner scanner) {
		System.out.println("Enter the first node: ");
		int value = scanner.nextInt();
		root = new Node(value);
		populate(scanner, root);
	}

	private void populate(Scanner scanner, Node node) {
		System.out.println("Do you want to enter to the left of " + node.value);
		boolean left = scanner.nextBoolean();
		if (left) {
			System.out.println("Enter the value of the left of " + node.value);
			int value = scanner.nextInt();
			node.left = new Node(value);
			populate(scanner, node.left);
		}

		System.out.println("Do you want to enter to the right of " + node.value);
		boolean right = scanner.nextBoolean();
		if (right) {
			System.out.println("Enter the value of the right of " + node.value);
			int value = scanner.nextInt();
			node.right = new Node(value);
			populate(scanner, node.right);
		}
	}

	public void display() {
		display(root, "");
	}

	private void display(Node node, String indent) {
		if (node == null) {
			return;
		}
		System.out.println(indent + node.value);
		display(node.left, indent + "\t");
		display(node.right, indent + "\t");
	}

	public void prettyDisplay(){
		prettyDisplay(root, 0);
	}

	private void prettyDisplay(Node node, int level) {
		if (node == null) {
			return;
		}

		prettyDisplay(node.right, level + 1);

		if (level != 0) {
			for (int i = 0; i < level - 1; i++) {
				System.out.println("|\t\t");
			}
			System.out.println("|-------> " + node.value);
		} else {
			System.out.println(node.value);
		}
		prettyDisplay(node.left, level + 1);
	}
}
