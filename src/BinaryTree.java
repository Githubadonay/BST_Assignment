public class BinaryTree {
    // Root of BST
    Node root;

    // Constructor
    BinaryTree() {
        root = null;
    }

    /* A recursive function to insert a new node in BST */

    // find and return the minimum key of the tree
    public int findMin() {
        Node temp = root;
        while (temp.leftChild()) {
            temp = temp.getLeft();
        }
        return temp.getKey();
    }

    public int leftChild(Node p) {
        return 0;
    }

    public int rightChild(Node p) {
        return 0;
    }

    // find and return the maximum key of the tree
    public int findMax() {
        return 0;
    }

    // Tests if the list is empty. return true if Tree is empty; else false
    public boolean isEmpty() {
        return true;
    }

    // Returns the number of elements in the tree
    public int size() {
        return 0;
    }

    // print tree nodes in an inorder traversal
    public void diplayInOrder() {

    }

    public void diplayPreOrder() {

    }

    public void diplayPostOrder() {

    }

    private class Node {

        private Node left;
        private Node right;
        private int key;

        private Node(int data) {
            this.key = data;
            left = right = null;
        }

        public Node getLeft() {
            return this.left;
        }

        public Node RightChild() {
            return this.right;
        }

        public int getKey() {
            return this.key;
        }

        public void setLeft(Node left) {
            this.left = left;
        }
        public void setRight(Node right) {
            this.right = right;
        }
        public void setKey(int key) {
            this.key = key;
        }
    }

}
