
package LinkedList;
public class LL {
    private Node head;

    private Node tail;

    private  int size;

    public LL() {
        this.size = 0;
    }

//    the method below is used to insert a value at the beginning of the linked list
    public void insertFirst (int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

//    the method below is used to insert a value at the end of the linked list
    public void insertLast (int val) {
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
//        alternative way to insert at last without using tail O(n) - time complexity
//        Node temp = head;
//        while (temp.next != null){
//            temp = temp.next;
//        }
//        temp.next = node;
        size ++;
    }

//    the method below is used to insert a value at any position in  the linked list
    void insert (int val, int pos){
        if (pos == 0) {
            insertFirst(val);
            return;
        }
        if (pos == size) {
            insertLast(val);
            return;
        }
        int count = 1;
        Node node = new Node(val);
        Node temp = head;
        while ((temp != null) && ((pos - 1) != count)){
            count ++;
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        int val = 0;
        if (head == null) {
            System.out.println("Error in deletion as the list is empty");
        }
        else if (head.next == null) {
            val = head.value;
            head = null;
        }
        else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            val = temp.next.value;
            temp.next = null;
        }
        return val;
    }

    public int delete(int pos){
        if (pos == 0){
            deleteFirst();
        }
        if (pos == size){
            deleteLast();
        }
        int count = 1;
        Node temp = head;
        while ((temp !=null) && ((pos - 1) != count)) {
            temp = temp.next;
            count ++;
        }
        int val = temp.next.value;
        temp.next= temp.next.next;
        size --;
        return val;
    }

    public void display () {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
