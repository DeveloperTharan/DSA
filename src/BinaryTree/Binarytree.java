package BinaryTree;

import java.util.ArrayList;

public class Binarytree {
    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void Insert(int item) {
        var node = new Node(item);

        if (root == null) {
            root = node;
            return;
        }

        var current = root;

        while (true) {
            if (item < current.value) {
                if (current.left == null) {
                    current.left = node;
                    break;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = node;
                    break;
                }
                current = current.right;
            }
        }
    }

    public boolean find(int item) {
        if (root != null) {
            var current = root;

            while (current != null) {
                if (item < current.value) {
                    current = current.left;
                } else if (item > current.value) {
                    current = current.right;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * DFS
     * Pre-order
     * In-order
     * Post-order
     */
    public void PreOrderTraversal() {
        PreOrderTraversal(root);
    }

    private void PreOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.value + " ");
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }

    public void InOrderTraversal() {
        InOrderTraversal(root);
    }

    private void InOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        PreOrderTraversal(root.left);
        System.out.print(root.value + " ");
        PreOrderTraversal(root.right);
    }

    public void PostOrderTraversal() {
        PostOrderTraversal(root);
    }

    private void PostOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
        System.out.print(root.value + " ");
    }

    public int MinValueOfTree() {
        if (root == null) {
            throw new IllegalStateException();
        }

        Node current = root;
        Node last = null;

        while (current != null) {
            last = current;
            current = current.left;
        }

        return last.value;
    }

    public boolean isBinarySearchTree() {
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node root, int min, int max) {
        if (root == null) {
            return true;
        }

        if (root.value < min || root.value > max) {
            return false;
        }

        return isBinarySearchTree(root.left, min, root.value - 1) &&
                isBinarySearchTree(root.right, root.value + 1, max);
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root.left == null && root.right == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public ArrayList<Integer> getNodeAtDistance(int distance){
        var list = new ArrayList<Integer>();
        getNodeAtDistance(root, distance, list);
        return list;
    }

    private void getNodeAtDistance(Node root, int distance, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        if (distance == 0) {
            list.add(root.value);
            return;
        }

        getNodeAtDistance(root.left, distance - 1, list);
        getNodeAtDistance(root.right, distance - 1, list);
    }

    /* BFS (Level Order Traversal) */
    public void LevelOrderTraversal(){
        for(int i=0; i<=height(); i++){
            for(var value: getNodeAtDistance(i)){
                System.out.println(value);
            }
        }
    }
}
