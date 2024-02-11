package BinaryTree;

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

    public boolean find(int item){
        if(root != null){
            var current = root;

            while(current != null){
                if(item < current.value){
                    current = current.left;
                } else if(item > current.value){
                    current = current.right;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
