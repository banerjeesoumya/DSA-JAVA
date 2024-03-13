package LinkedList;

public class DLL {

    Node head;
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        Node temp = head;
        //we move forward until we have the reached the node whose next is null
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }

    public void insert(int val, int pos) {
        Node node = new Node(val);
        Node temp = head;
        int c = 1;
//        if we want to add a node after a certain position in the linked list 👇👇
        while ((temp.next != null) && (pos != c)) {
            temp = temp.next;
            c ++;
        }

//        if we want to add a node after a certain value already present in the linked list 👇👇
//        while ((temp.next != null) && temp.val != pos) {
//            temp = temp.next;
//        }

//        Checking for the null pointer exception 👇👇
        if (temp.next != null) {
            node.next = temp.next;
            temp.next.prev = node;
        }
        node.prev = temp;
        temp.next = node;

    }

    public void deleteFirst() {
        head = head.next;
        head.prev = null;

    }
    public void deleteLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp = temp.prev;
        temp.next = null;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Printing in reverse order");

        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
