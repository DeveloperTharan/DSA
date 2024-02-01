package BineryTree;

public class Binerytree {
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
            if (current.value > item) {
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
}
