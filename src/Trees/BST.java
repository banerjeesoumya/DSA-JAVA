package Trees;
public class BST {
    public class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }
    private Node root;
    public BST() {

    }
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty() {
        return root == null;
    }
    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int nums[]) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }
    public void insert(int data) {
        root = insert (root, data);
    }
    public Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }
        if (data < node.value) {
            node.left = insert(node.left, data);
        }
        else if (data > node.value) {
            node.right = insert(node.right, data);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }
    public boolean balanced() {
        return balanced(root);
    }
    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(root, "Root Node : ");
    }
    public void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        System.out.println(("Height: " + node.height));
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }
}