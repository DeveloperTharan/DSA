package AVLTree;

public class AVL_Tree {
    private class Node {
        private int value;
        private Node left;
        private Node right;
        private int height; // for height of the tree

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value" + this.value;
        }
    }

    private Node root;

    private int height(Node root) {
        return (root == null) ? -1 : root.height;
    }

    public void Insert(int value) {
        root = Insert(root, value);
    }

    private Node Insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (root.value > value) {
            root.left = Insert(root.left, value);
        } else {
            root.right = Insert(root.right, value);
        }

        root.height = Math.max(height(root.left), height(root.right)) + 1;

        balanceFactor(root);

        return root;
    }

    private void balanceFactor(Node root) {
        int balanceFactor = height(root.left) - height(root.right);
    
        if (balanceFactor > 1) {
            if (height(root.left.left) >= height(root.left.right)) {
                // Left-left case
                System.out.println("Right rotate " + root.value);
            } else {
                // Left-right case
                System.out.println("Left rotate " + root.left.value);
                System.out.println("Right rotate " + root.value);
            }
        } else if (balanceFactor < -1) {
            if (height(root.right.right) >= height(root.right.left)) {
                // Right-right case
                System.out.println("Left rotate " + root.value);
            } else {
                // Right-left case
                System.out.println("Right rotate " + root.right.value);
                System.out.println("Left rotate " + root.value);
            }
        }
    }
    
}
