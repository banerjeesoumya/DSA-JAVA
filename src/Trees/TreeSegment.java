package Trees;

public class TreeSegment {
    private class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
    private Node root;

    public TreeSegment(int[] arr){
//        now we will be creating the tree.
        this.root = construct(arr, 0, arr.length - 1);
    }

    private Node construct(int[] arr, int start, int end){
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

//        create a Node at the index where you are currently at and then divide the tree from the middle
        Node node = new Node(start, end);

        int mid = (start + end) / 2;
        node.left = this.construct(arr, start, mid);
        node.right = this.construct(arr, mid + 1, end);
//        the current node's data will be the sum of the node.left's data and node.right's data
        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
         String str = "";

         if (node.left != null) {
             str = str + "Interval[" + node.left.startInterval + "-" + node.left.endInterval + "] snd data: " + node.left.data + " => ";
         } else {
             str = str + "No left child";
         }

//         For current Node
        str = str + "Interval[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <= ";

//         For right child
        if (node.right != null) {
            str = str + "Interval[" + node.right.startInterval + "-" + node.right.endInterval + "] snd data: " + node.right.data;
        } else {
            str = str + "No right child";
        }
        System.out.println(str);

//        Now we call recursively for every nodes
        if (node.left != null) {
            display(node.left);
        }
        if (node.right != null) {
            display(node.right);
        }
    }

//    query
    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);
    }
    private int query(Node node, int qsi, int qei) {
        if (node.startInterval >= qsi && node.endInterval <= qei) { //👈 In this case the node is completely lying inside the query
            return node.data;
        } else if (node.startInterval > qei || node.endInterval < qsi) { //👈 this is the case when the node is completely outside the query
            return 0;
        } else { // 👈 condition when there is an overlap
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    public void update(int index, int val) {
        this.root.data = update(root, index, val);
    }

    private int update(Node node, int index, int val) {
//        👇👇 First let us check if the index is lying within the interval or not 👇👇
        if(index >= node.startInterval && index <= node.endInterval) {
//            Ultimately we have to update the value by going at the leaf node only so considering that case only.
//            👇👇 Thus at the leaf node the start index = end index 👇👇
            if (index == node.startInterval && index == node.endInterval) {
                node.data = val;
                return node.data;
            } else {
                int leftAns = update(node.left, index, val);
                int rightAns = update(node.right, index, val);
                return leftAns + rightAns;
            }
        }
        return node.data;
    }
}
