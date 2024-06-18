package question1;

public class Main {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();

        //insertion one after another
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);
        l1.insert(90);
       l1.insert(100); 
        //l1.insert(110);
        l1.display();

//        //insert by position
        l1.insert(60, 1);
        l1.display();
        l1.insert(70, 4);
        l1.display();
        l1.insert(80, 8);
        l1.display();
        l1.length();
//        
//        
        l1.displayMiddleElement();
        System.out.println("middle index");
        int mid = l1.displayMiddleElement(); // to add node in the middle of LL
        System.out.println(mid);
        l1.insert(200, mid+1); //increasing position of mid to add new node after the middle node 
        l1.display();
        System.out.println("\n-----------------------------------------------------\n");
        l1.sortLL();
        l1.display();
//        boolean isInserted =l1.insert(90, 10);
//        System.out.println(isInserted);
//        l1.display();
        //reverse 
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

        //delete by value
        /*l1.deleteByVal(80);
        l1.display();
        l1.deleteByVal(70);
        l1.display();
        l1.deleteByVal(60);
        l1.display();
        l1.deleteByVal(80);
        l1.display();*/

//        l1.insert(80, 4);
//        l1.insert(80, 6);
//        l1.display();
//
//        while( l1.deleteByVal(80) );
//
//        l1.display();



    }
}
