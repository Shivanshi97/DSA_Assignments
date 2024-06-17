public class Main {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();

        l1.insert(8);
        l1.insert(1);
        l1.insert(2);
        l1.insert(5);
        l1.insert(7);
        l1.insert(4);
        
        System.out.println("Elements of Linked List : ");
        l1.display();
       
        
        int maxElement=l1.findmax();
        System.out.println("maximum element : "+maxElement);
        
        int minElement=l1.findmin();
        System.out.println("minimum element : "+minElement);
        
        int sumOfEven=l1.evensum();
        System.out.println("sum of even numbers : "+sumOfEven);


    }
}
