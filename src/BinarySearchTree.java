public class BinarySearchTree extends BinaryTree {
    // add a node in the BST
    public int add(int key) {
        if (root == null) {
            root = addNode(key);
            return key;
        }
        addBSTNode(root, key);
        return key;
    }

    private void addBSTNode(Node root, int key) {
        if (root.getKey() == key)
            throw new IllegalStateException("Number already exists!!");

        if (key < root.getKey()) {
            // Go left
            if (root.getLeft() == null) {
                root.setLeft(addNode(key));
            } else {
                addBSTNode(root.getLeft(), key);
            }
        } else {
            // Go right
            if (root.getRight() == null) {
                root.setRight(addNode(key));
            } else {
                addBSTNode(root.getRight(), key);
            }
        }
    }

    // delete a node from the BST. Implement all the three cases for deletion.
    public int remove(int k) {
        root = removeBSTNode(root, k);
        return k;
    }

    private Node removeBSTNode(Node root, int key) {
        // Base Case
        if (root == null) {
            throw new IllegalStateException("Key: " + key + " not found in the tree");
        }
        // Compare the key and take left or right side using recursion
        if (key < root.getKey()) {
            root.setLeft(removeBSTNode(root.getLeft(), key));
        } else if (key > root.getKey()) {
            root.setRight(removeBSTNode(root.getRight(), key));
        } else {
            // Key is equal to root's key and node needs to be deleted
            // Case 1: node with only one child or Case 2: no child
            if (root.getLeft() == null) {
                size--;
                return root.getRight();
            } else if (root.getRight() == null) {
                size--;
                return root.getLeft();
            }

            // Case 3: Node with two children, find minimum on right subtree
            Node minNode = findMinNode(root.getRight());
            root.setKey(minNode.getKey());

            // Delete the successor
            root.setRight(removeBSTNode(root.getRight(), root.getKey()));
        }
        return root;
    }

    private Node findMinNode(Node node) {
        Node current = node;
        while (current.getLeft() != null) {
            current = current.getLeft();
        }
        return current;
    }

    // search for a node with a key k. return the key if found; else throw an
    // exeption
    public int search(int key) {
        if (root == null) {
            throw new IllegalStateException("Key: " + key + " not found in the tree");
        }
        return searchNode(root, key);
    }

    private int searchNode(Node root, int key) {
        if (root == null) {
            throw new IllegalStateException("Key: " + key + " not found in the tree");
        }
        if (key < root.getKey()) {
            return searchNode(root.getLeft(), key);
        } else if (key > root.getKey()) {
            return searchNode(root.getRight(), key);
        } else {
            return key;
        }
    }

}
