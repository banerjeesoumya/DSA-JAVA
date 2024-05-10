package Trees;

public class TreeAVL {
    private class Node {
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
    public TreeAVL() {

    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }
    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++){
            this.insert(nums[i]);
        }
    }

    private void insert(int val) {
        root = insert(root, val);
    }

    private Node insert(Node node, int val) {
        if (node == null) {
            node = new Node(val);
            return node;
        }
        if (val < node.value) {
            node.left = insert(node.left, val);
        }
        if (val > node.value) {
            node.right = insert(node.right, val);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return rotate(node);
    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) { //👈 it means it is left heavy, now we have to check if it is left-left case or left-right case
            if(height(node.left.left) - height(node.left.right) > 0) { //👈 this condition means it is the left-left case
                return rightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) { //👈 the above condition means it is the left-right
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left) - height(node.right) < 1) { //👈  it means it is right heavy, now we have to check if it is right-right case or right left case
            if (height(node.right.left) - height(node.right.right) < 0) { //👈 this condition means if it is the right-right case
                return leftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) > 0) { //👈 this condition means if it is the right left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node rightRotate(Node p) {
//        Given format :
        Node c = p.left;
        Node t = c.right;

//        After changes
        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    private Node leftRotate(Node c) {
//        Given format :
        Node p = c.right;
        Node t = p.left;

//        After changes:
        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return p;
    }

    public void preetyDisplay() {
        preetyDisplay(root, 0);
    }
    private void preetyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        //going till the right most node first
        preetyDisplay(node.right, level + 1);
        if (level != 0) { //it means we are not in the root node
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        }
        else {
            System.out.println(node.value);
        }
        preetyDisplay(node.left, level + 1);
    }
}
