package com.binary_search_tree;

import java.util.Stack;

public class BinarySearchTree {

	class Pair{		//inner class
		Node node;
		char flag;
		
		public Pair(Node node, char flag) {
			super();
			this.node = node;
			this.flag = flag;
		}	
	}
	private Node root;
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public BinarySearchTree() {
		root = null;
	}
	
	//insertion in BST
	public boolean insert(int data) {

		Node newNode = new Node(data);
		
		if(newNode == null) {
			return false;
		}
		
		//check if root is null i.e tree is empty
		if(root == null) {
			root = newNode;
			return true;
		}
		
		Node temp = root;
		while(true) {
			if(data == temp.getData()) // not allowing duplicate element
			{
				return false;
			}
			if( data < temp.getData()) {		// if data < parent node go to left sub tree	
				if(temp.getLeft() == null)		//check if left child exists or not
				{
					temp.setLeft(newNode);		// if it doesn't, assign newnode as left child
					return true;
				}
				temp = temp.getLeft();			//if it does, shift temp to its left child
			}
			else								// if data > parent node go to right sub tree	
			{
				if(temp.getRight() == null)		//check if right child exists or not
				{
					temp.setRight(newNode);		// if it doesn't, assign newnode as right child
					return true;
				}
				temp = temp.getRight();			//if it does, shift temp to its right child
			}
		}
		
	}

	//Traversing using preorder
	public void preOrder() {
		System.out.println("Preorder Traversal");
		Node temp = root;
		Stack<Node> stack = new Stack<>();
		
		while(temp != null || !stack.isEmpty() )
		{
			while(temp != null)
			{
				System.out.print(temp.getData()+ " ");
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop().getRight();
		}
		System.out.println();
	}
	
	//Traversing using preorder with recursion
		public void preOrder(Node root) {
//			System.out.println("Preorder Traversal");
			if(root==null) {
				return;
			}
			
			System.out.print(root.getData()+" ");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	
	//Traversing using inorder
	public void inOrder() {
		System.out.println("\nInorder Traversal");
		Node temp = root;
		Stack<Node> stack = new Stack<>();
		
		while(temp != null || !stack.isEmpty())
		{
			while(temp != null)
			{	
				//System.out.print(temp.getData()+ " ");
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop();
			System.out.print(temp.getData()+ " ");
			temp = temp.getRight();
		}
		
		System.out.println();
	}
	
	//Traversing using inorder with recursion
	public void inOrder(Node root) {	
		//System.out.println("Inorder Traversal");
		if(root==null) {
			return;
		}
		
		inOrder(root.getLeft());
		System.out.print(root.getData()+" ");
		inOrder(root.getRight());
	}

	//Traversing using postorder
	public void postOrder() {
		System.out.println("\nPostorder Traversal");
		Stack<Pair> stack=new Stack<>();
		Node temp = root;
		
		while(temp!=null || !stack.isEmpty()) {
			while(temp!=null) {
				stack.push(new Pair(temp,'L'));	//adding flag L to temp
				temp=temp.getLeft();
			}
			
			Pair pair=stack.pop();				//if temp is null, pop the pair
			
			if(pair.flag=='L') {				//if popped pair has flag L
				temp=pair.node.getRight();		//shift temp to right child
				pair.flag='R';					//update flag of pair to R
				stack.push(pair);				//and push the updated pair
			}
			else
				System.out.print(pair.node.getData()+" ");
		}
		System.out.println();
	}
	
	//Traversing using postorder with recursion
		public void postOrder(Node root) {
			//System.out.println("Postorder Traversal");
			if(root==null) {
				return;
			}
			
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(root.getData()+" ");
		}

	//Count number of nodes
	public int count(Node root) {
		if(root==null) {
			return 0;
		}
		
		return 1+count(root.getLeft())+count(root.getRight());
	}
		
	//get maximum element
	public int getMax() {
		if(root==null)
			return 0;
		
		Node temp=root;
		
		while(temp.getRight()!=null) {
			temp=temp.getRight();
		}
		return temp.getData();
	}
	
	//search an element
	public boolean search(int key) {
		Node temp=root;
		
		if(root==null)
			return false;
		
		while(temp!=null) {
			if(temp.getData()==key)
				return true;
			
			if(key<temp.getData())
				temp=temp.getLeft();
			else
				temp=temp.getRight();
		}
		return false;
	}
	
	//deletion by value
	






}
