package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertLast(9);
//        list.insert(2, 2);
        list.display();
        System.out.println("Deleted Element: " + list.deleteLast());
        list.display();
    }
}

