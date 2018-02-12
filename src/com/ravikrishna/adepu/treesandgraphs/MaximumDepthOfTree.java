package com.ravikrishna.adepu.treesandgraphs;

class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class MaximumDepthOfTree {



	public Node insert(Node root, int data) {
		if (root != null) {
			if (data > root.data) {
			  root.right=insert(root.right, data);

			} else if (data < root.data) {

			 root.left=insert(root.left, data);

			} else {
				root.right= insert(root.right, data);
			}

		} else {
			root = new Node(data);
		}
		return root;

	}

	public void printPreorder(Node root) {

		if (root == null)
			return;	
		System.out.println(root.data);
		printPreorder(root.left);
		printPreorder(root.right);

	}

	public static void main(String... args) {

		MaximumDepthOfTree m = new MaximumDepthOfTree();
		Node root = null;
        root = m.insert(root, 76);
        root = m.insert(root, 32);
        root = m.insert(root, 2);
        root = m.insert(root,19);
        root = m.insert(root,65);
		m.printPreorder(root);

	}

}
