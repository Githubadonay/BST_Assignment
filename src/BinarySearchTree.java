public class BinarySearchTree extends BinaryTree {
    // add a node in the BST
    public int add(int k) {
        if (root == null) {
            root = addNode(k);
        }
        return addBSTNode(root, k);
    }

    public int addBSTNode(Node root, int key) {
        if (root.getKey() == key)
            throw new IllegalStateException("Number, already exists!!");
        if (root.getKey() > key) {
            root.setLeft(addNode(key));
        } else {
            root.setRight(addNode(key));
        }
        return key;

    }

    // delete a node from the BST. Implement all the three cases for deletion.
    public int remove(int k) {
        return 0;
    }

    // search for a node with a key k. return the key if found; else throw an
    // exeption
    public int search(int k) {
        if (root == null)
            throw new IllegalStateException("Number, already exists!!");
        return searchNode(root, key);
    }

    public int searchNode(Node root, int key) {
        if (key < root.getKey()) {
            searchNode(leftChild(root), key);
        } else if (key > root.getKey()) {
            searchNode(rightChild(root), key);
        }else
        return key;
    }

}
