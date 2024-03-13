package Stacks_And_Queues;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }
    public boolean isFull() {
        return end == data.length;
    }
    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int removed = data[0];
        //but we have to also take care of shifting the
        // elements to the left that is the in the data array,
        //the previous element gets updated to the next element
        //if the array was data = [1, 2, 3, 4] it will be updated to
        //data  = [2, 3, 4, 0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end --;
        return removed;
    }
    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }
    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <-   ");
        }
        System.out.println("END");
    }
}
