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

        balanceFator(root);

        return root;
    }

    // need refactor (not working) //
    private void balanceFator(Node root) {
        var res = (height(root.left) - height(root.right));

        if (res > 1) {
            if (height(root.left) - height(root.right) < 0) {
                System.out.println("heavy" + " " + root.left.value);
            }
            System.out.println("right rotate" + " " + root.value);
        } else if (res < -1) {
            if (height(root.left) - height(root.right) > 0) {
                System.out.println("right rotate" + " " + root.right.value);
            }
            System.out.println("left rotate" + "  " + root.value);
        }
    }
}
