package LinkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertLast(9);
//        list.insert(2, 3);
//        list.display();
//        System.out.println("Deleted Element: " + list.delete(3));
//        list.display();

//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(101, 99);
//        list.display();
//        list.deleteLast();
//        list.display();

        CLL list = new CLL();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);
        list.insertFirst(12);
        list.insertLast(99);
        list.display();
        System.out.println("Deleted element " + list.delete(12));
//        System.out.println("Deleted element " + list.deleteLast());
        list.display();
    }
}

