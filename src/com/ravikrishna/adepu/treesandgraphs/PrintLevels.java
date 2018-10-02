package com.ravikrishna.adepu.treesandgraphs;

class Tree {
	Tree left, right;
	int data;

	Tree(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class PrintLevels {

	public static void main(String[] args) {
		Tree t = new Tree(1);
		t.left = new Tree(2);
		t.right = new Tree(3);
		t.right.left = new Tree(4);
		t.right.right = new Tree(5);
		printLevels(t);

	}

	private static void printLevels(Tree t) {

	}

}
