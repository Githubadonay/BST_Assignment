public class BinaryTree {
    // Root of BST
    Node root;
    int size = 0;

    // Constructor
    BinaryTree() {
        root = null;
        }

    /* A recursive function to insert a new node in BST */

    // find and return the minimum key of the tree
    public int findMin() {
        Node Current = root;
        while (Current.getLeft() != null) {
            Current = Current.getLeft();
        }
        return Current.getKey();
    }

    public Node addNode(int key){
        Node current = new Node(key);
        size++;
        return current;
    }

    public int leftChild(Node p) {
        if (p == null || p.left == null) {
            throw new IllegalStateException("No left child found!!!");
        }
        return p.left.key;
    }

    public int rightChild(Node p) {
        if (p == null || p.right == null) {
            throw new IllegalStateException("No Right child found!!!");
        }
        return p.right.key;
    }

    // find and return the maximum key of the tree
    // Checks the Max by checking all the right items until its null, once its at
    // the end of the right side it stops declaring it as max
    public int findMax() {
        Node Current = root;
        while (Current.getRight() != null) {
            Current = Current.getRight();
        }
        return Current.getKey();
    }

    // Tests if the list is empty. return true if Tree is empty; else false
    public boolean isEmpty() {
        return root == null;
    }

    // Returns the number of elements in the tree
    public int size() {
        return size;
    }

    // print tree nodes in an inorder traversal
    public void diplayInOrder() {
        if (root != null) {
            inOrder(root);
        }
    }

    // L/Ro/Ri
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getKey()+ " ");
            inOrder(root.getRight());
        }
    }

    public void diplayPreOrder() {
        if (root != null) {
            preOrder(root);
        }
    }

    // Ro/L/Ri
    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.getKey()+ " ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    public void diplayPostOrder() {
        if (root != null) {
            postOrder(root);
        }
    }

    // L/Ri/Ro
    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getKey()+ " ");

        }
    }

    class Node {

        private Node left;
        private Node right;
        private int key;

        private Node(int data) {
            this.key = data;
            this.left = this.right = null;
        }

        public Node getLeft() {
            return this.left;
        }

        public Node getRight() {
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
