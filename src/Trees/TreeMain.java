package Trees;

import java.util.Scanner;

public class TreeMain {
    public static void main(String[] args) {
//        BinaryTree bt = new BinaryTree();
//        bt.populate();
//        bt.preetyDisplay();
//        BST bt1 = new BST();
//        int[] nums = {13, 10, 15, 5, 11, 4, 6, 16, 3};
//        bt1.populate(nums);
//        bt1.display();

//        TreeAVL bt2 = new TreeAVL();
//        int[] nums = {13, 10, 15, 5, 11, 4, 6, 16, 3, 14};
//        bt2.populate(nums);
//        bt2.preetyDisplay();
        int[] nums3 = {3, 8, 7, 6, -2, -8, 4, 9};
        TreeSegment bt3 = new TreeSegment(nums3);
        bt3.display();
    }
}
  