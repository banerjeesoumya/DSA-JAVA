package LinkedList;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }
    public void insert (int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        node.next = head;
        temp.next = node;
        head = node;
    }
    public void insertLast(int val) {
        Node node = new Node (val);
        node.next = head;
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public int deleteFirst() {
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        int del = temp.next.val;
        temp.next = head.next;
        head = head.next;
        return del;
    }
    public int deleteLast() {
        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        int del = temp.next.val;
        temp.next = head;
        return del;
    }

    public int delete(int val) {
        if (val == head.val) {
            return deleteFirst();
        }
        Node temp = head;
        int del = 0;
        while (temp.next != head) {
            if (temp.next.val == val) {
                del = temp.next.val;
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return del;
    }

    public void display() {
            Node temp = head;
//        Node ptr = temp;
//        System.out.print(temp.val + " -> ");
//        temp = temp.next;
//        while (temp != ptr) {
//            System.out.print(temp.val + " -> ");
//            temp = temp.next;
//        }
//        System.out.println();
        if (head != null) {
            do {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }while (temp != head);
        }
        System.out.println("HEAD");
    }

    private class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
