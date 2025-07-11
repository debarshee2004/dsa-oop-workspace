package linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        // Test addHead
        list.addHead(30);
        list.addHead(20);
        list.addHead(10);
        System.out.print("After addHead operations: ");
        list.display();
        System.out.println();

        // Test addTail
        list.addTail(40);
        list.addTail(50);
        System.out.print("After addTail operations: ");
        list.display();
        System.out.println();

        // Test add at specific index
        list.add(25, 2); // Inserting 25 at index 2
        list.add(5, 0);  // Inserting 5 at index 0
        list.add(60, 6); // Inserting 60 at the end
        System.out.print("After add(index, value) operations: ");
        list.display();
        System.out.println();

        System.out.println(list.removeHead());
        System.out.println(list.removeTail());
        list.display();
    }
}
