package question1;

import java.util.Stack;

public class LinkedList {
	private Node head;

	public Node getHead() {
		return head;
	}

	public LinkedList() {
		head = null;
	}

//inserting new node at the end
	public boolean insert(int data) {

		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}

		if (head == null) {
			head = newNode;
			return true;
		}

		Node temp = head;
		if (head.getData() == data) {
			return false;
		}
		while (temp.getNext() != null) {
			temp = temp.getNext();
//			if (temp.getData() == data) {
//				return false;
//			}
		}

		temp.setNext(newNode);
		return true;
	}

//inserting new node at a given position
	public boolean insert(int data, int position) {
		if (position <= 0 || (head == null && position > 1)) {
			return false;
		}

		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}

		if (position == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}

		// locate prev node
		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}
		}

		newNode.setNext(prev.getNext());
		prev.setNext(newNode);

		return true;
	}

//to display a LL in reverse without using Recursion    
	public void displayReverse() {
		Stack<Node> stack = new Stack<Node>();
		Node temp = head;

		while (temp != null) {
			stack.push(temp);
			temp = temp.getNext();
		}

		while (!stack.isEmpty()) {
			System.out.print(stack.pop().getData() + " ");
		}
		System.out.println();
	}

//to display a LL in reverse using Recursion
	public void displayReverse(Node temp) {
		if (temp == null) {
			System.out.println();
			return;
		}
		displayReverse(temp.getNext());
		System.out.print(temp.getData() + " ");
	}

//to display data     
	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

// to reverse a linked list (w/o recursion)
	public void reverse() {
		if (head == null || head.getNext() == null) {
			return;
		}

		Node n1 = head;
		Node n2 = head.getNext();

		while (n2 != null) {
			Node n3 = n2.getNext();
			n2.setNext(n1);
			n1 = n2;
			n2 = n3;
		}

		head.setNext(null);
		head = n1;
	}

	// to delete a node by value
	public boolean deleteByVal(int data) {
		if (head == null) {
			return false;
		}

		if (head.getData() == data) {
			head = head.getNext();
			return true;
		}

		Node prev = head, del = head;
		while (del.getData() != data) {
			prev = del;
			del = del.getNext();
			if (del == null) {
				return false;
			}
		}

		prev.setNext(del.getNext());
		return true;
	}

	// delete a node by position
	public boolean deleteByPosition(int position) {
		if (head == null || position <= 0) {
			return false;
		}

		if (position == 1) {
			head = head.getNext();
			return true;
		}

		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev.getNext() == null) {
				return false;
			}
		}

		Node del = prev.getNext();
		prev.setNext(del.getNext());

		return true;
	}

	// to find the length of a singly linked list
	public int length() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			count++;
			temp = temp.getNext();

		}
		System.out.println("\nLength of Linked List: " + count);
		return count;
	}

	// to find the middle element of a singly linked list in one pass
	public int displayMiddleElement() {

		Node temp1 = head;
		Node temp2 = head;
		int count = 0;

		if (head == null) {
			System.out.println("Linked List is Empty");
		}

		while (temp1.getNext() != null && temp1.getNext().getNext() != null) {
			// not working for empty LL
			temp1 = temp1.getNext().getNext();
			temp2 = temp2.getNext();
			count++; // finding the middle index of the LL

		}
		System.out.println("Middle Element: " + temp2.getData() + " index: " + count);
		return count + 1;
	}

	// to remove duplicates from a sorted linked list
	public boolean deleteDuplicateinSortedList(int data) {
		if (head == null) {
			return false;
		}

		if (head.getData() == data) {
			head = head.getNext();
			return true;
		}

		Node prev = head, del = head;
		while (del.getData() != data) {
			prev = del;
			del = del.getNext();
			if (del == null) {
				return false;
			}
		}

		prev.setNext(del.getNext());
		return true;
	}

	//sorting Linked List
	public void sortLL() {
		Node temp;
		boolean swap;
		System.out.println("Sorted LL 1: ");
		
		do {
			temp = head;
			swap=false;
			
			while (temp!=null && temp.getNext() != null) {
				if (temp.getData() > temp.getNext().getData()) {
	                // Swap two adjacent nodes
	                int tempData = temp.getData();
	                temp.setData(temp.getNext().getData());
	                temp.getNext().setData(tempData);
	                swap=true;
	            }
	            temp = temp.getNext();
			}
		}while(swap);
	}

	//to Merge A Linked List Into Another Linked List At Alternate Positions
	public void merge(LinkedList l2) {
		Node a_current=head;
		Node a_next;
		
		Node b_current=l2.head;
		Node b_next;
		
		while(a_current!=null && b_current!=null) {
			
			a_next=a_current.getNext();
			b_next=b_current.getNext();
			
			if(a_current!=null)
				b_current.setNext(a_next);
			a_current.setNext(b_current);
			
			a_current=a_next;
			b_current=b_next;
		}	
		
	}

	//to remove duplicates from a sorted linked list
	public void delDupFromSortedList(LinkedList l) {
		l.sortLL();
		l.display();
		Node temp=head;
		
		if(head==null)
			return;
		
		while(temp!=null && temp.getNext()!=null) {
			while(temp.getData()==temp.getNext().getData())
			{
				temp.setNext(temp.getNext().getNext());
			}
			temp=temp.getNext();
		}
		
	}

	//to find the third node from the end in a singly linked list
	public void findThirdNodeFromEnd() {
		int count=length();
		
		if(count<3) {
			return;
		}
		
		Node temp=head;
		for(int i=1;i<count-2;i++) {
			temp=temp.getNext();
		}
		
		System.out.println(temp.getData());
	}
	
	//to remove Nth Node from the end of a linked list 
	public void removeNthNode(int position) {
		Node temp=head;
		Node prev=head;
		
		if(head==null)
			return;
		
		int count=length();
		
		for(int i=1;i<count-position-1;i++) {
			prev=temp;
			temp=temp.getNext();
		}
		prev.setNext(temp.getNext());
	}
	
	//to merge two sorted linked list
	

}
