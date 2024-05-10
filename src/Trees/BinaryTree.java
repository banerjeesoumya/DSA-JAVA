package Trees;

import java.util.Scanner;

public class BinaryTree {
    Scanner sc = new Scanner(System.in);
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public BinaryTree() {
//        root = create();
        preOrder((root));
        inOrder(root);
        postOrder(root);
    }
    private Node root;

//    inserting elements
    public void populate () {
        System.out.println("Enter the root node : ");
        int val = sc.nextInt();
        root = new Node(val);
        populate(root);
    }
    public void populate (Node node) {
        System.out.println("Do you have left child of " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left child of " + node.value );
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(node.left);
        }
        System.out.println("Do you have right child of " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right child of " + node.value);
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(node.right);
        }
    }
/* Creating my own way of populating the binary tree
public Node create(){
    Node node;
    int val;
    System.out.println("Enter the value (-1 for no value)");
    val = sc.nextInt();
    if (val == -1) {
        return null;
    }
    node = new Node(val);
    System.out.println("Enter the details of left child of " + val);
    node.left = create();
    System.out.println("Enter the details of right child of " + val);
    node.right = create();
    return node;
}
*/
    public void display() {
        display(this.root, "");
    }
    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
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


    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }
}
