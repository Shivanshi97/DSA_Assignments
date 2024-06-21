package com.binary_search_tree;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		System.out.println(bst.insert(50));
		System.out.println(bst.insert(20));
		System.out.println(bst.insert(80));
		System.out.println(bst.insert(10));
		System.out.println(bst.insert(30));
		System.out.println(bst.insert(60));
		System.out.println(bst.insert(90));
		System.out.println(bst.insert(15));
		System.out.println(bst.insert(25));
		System.out.println(bst.insert(70));
		
		bst.preOrder();
		bst.preOrder(bst.getRoot());
		bst.inOrder();
		bst.inOrder(bst.getRoot());
		bst.postOrder();
		bst.postOrder(bst.getRoot());
		
		System.out.println("\nNumber of nodes : "+bst.count(bst.getRoot()));
		
		System.out.println("Maximum element: "+bst.getMax());
		
		System.out.println(bst.search(80));
		System.out.println(bst.search(100));
	}

}
