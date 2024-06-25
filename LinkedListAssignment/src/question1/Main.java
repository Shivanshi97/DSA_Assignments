package question1;

//import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		
		// insertion
				l1.insert(10);
				l1.insert(110);
				l1.insert(30);
				l1.insert(40);
				l1.insert(100);
				l1.insert(90);
				l1.insert(50);
				l1.insert(50);
				l1.insert(50);
				l1.insert(50);
				l1.insert(50);
				l1.insert(20);
				l1.display();
				
				//insert by position
				l1.insert(60, 1);
				l1.display();
				l1.insert(70, 4);
				l1.display();
				l1.insert(80, 8);
				l1.display();
				//l1.length();
				
				//l1.sortLL();
								
//				l2.insert(30);
//				l2.insert(40);
//				l2.insert(100);
//				l2.insert(90);
//				l2.insert(50);
//				l2.display();
				
//				l1.merge(l2);
//				l1.display();
				
//				l1.delDupFromSortedList(l1);
//				l1.display();
//				
//				l1.findThirdNodeFromEnd();
//				
//				l1.removeNthNode(3);
//				l1.display();
				
				l1.deleteDuplicateinSortedList(50);
				l1.display();
//		System.out.println("0. Display elements of Linked List \r\n"
//				+ "1.Insert new element in Linked List by Value \r\n"
//				+ "2.Find the middle element of a singly linked list in one pass?\r\n"
//				+ "3.Reverse a singly linked list without recursion\r\n"
//				+ "4.Remove duplicate nodes in an unsorted linked list\r\n"
//				+ "5.Find the length of a singly linked list\r\n"
//				+ "6.Remove duplicates from a sorted linked list\r\n"
//				+ "7.Reverse a linked list\r\n"
//				+ "8.Find the third node from the end in a singly linked list\r\n"
//				+ "9.Remove Nth Node from the end of a linked list\r\n"
//				+ "10.Merge two sorted linked list\r\n"
//				+ "11.Add an element at the middle of the linked list\r\n"
//				+ "12.Sort a linked list\r\n"
//				+ "13.Merge A Linked List Into Another Linked List At Alternate Positions\r\n"
//				);
//		System.out.println("Enter your choice : ");
//		
//		switch (sc.nextInt()) {
//		case 0: System.out.println("0. Display elements of Linked List");
//				l1.display();
//				break;
//		case 1: System.out.println("1.Insert new element in Linked List");
//			break;
//		case 2: System.out.println("2.Find the middle element of a singly linked list in one pass");
//			break;
//		case 3: System.out.println("3.Reverse a singly linked list without recursion\r\n");
//			break;
//		case 4: System.out.println("4.Remove duplicate nodes from an unsorted linked list");
//			break;
//		case 5: System.out.println("5.Find the length of a singly linked list");
//			break;
//		case 6: System.out.println("6.Remove duplicates from a sorted linked list");
//			break;
//		case 7: System.out.println("7.Reverse a linked list");
//			break;
//		case 8: System.out.println("8.Find the third node from the end in a singly linked list");
//			break;
//		case 9: System.out.println("9.How to remove Nth Node from the end of a linked list");
//			break;
//		case 10: System.out.println("10.How to merge two sorted linked list");
//			break;
//		case 11: System.out.println("11.How to add an element at the middle of the linked list");
//			break;
//		case 12: System.out.println("12.How do you sort a linked list in Java");
//			break;
//		case 13: System.out.println("13.Merge A Linked List Into Another Linked List At Alternate Positions");
//			break;
//		case 14: System.out.println("14.Insert new element in Linked List by position");
//			
//			break;
//		case 15:
//			break;
//		case 16:
//			break;
//		case 17:
//			break;
//		case 18:
//			break;
//		case 19:
//			break;
//		case 20:
//			break;
//		default:
//			break;
//		}

		
        
//        
//        
//		l1.displayMiddleElement();
//		System.out.println("middle index");
//		int mid = l1.displayMiddleElement(); // to add node in the middle of LL
//		System.out.println(mid);
//		l1.insert(200, mid + 1); // increasing position of mid to add new node after the middle node
//		l1.display();
//		System.out.println("\n-----------------------------------------------------\n");
//		l1.sortLL();
//		l1.display();
//        boolean isInserted =l1.insert(90, 10);
//        System.out.println(isInserted);
//        l1.display();
		// reverse
//        l1.displayReverse();
//        l1.displayReverse(l1.getHead());
//
//        System.out.println();
//        l1.display();
//        l1.reverse();
//        l1.display();
//			deletion by position
//        l1.deleteByPosition(1);
//        l1.display();
//        l1.deleteByPosition(4);
//        l1.display();
//        l1.deleteByPosition(6);
//        l1.display();
//        l1.deleteByPosition(6);
//        l1.display();

		// delete by value
		/*
		 * l1.deleteByVal(80); l1.display(); l1.deleteByVal(70); l1.display();
		 * l1.deleteByVal(60); l1.display(); l1.deleteByVal(80); l1.display();
		 */

//        l1.insert(80, 4);
//        l1.insert(80, 6);
//        l1.display();
//
//        while( l1.deleteByVal(80) );
//
//        l1.display();

	}
}
