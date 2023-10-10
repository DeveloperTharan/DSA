package DSA.Trees.BinaryTree.BinaryTree;

public class DemoFor_Binary_Trees {
    public static void main(String[] args) {
        Binary_Trees tree = new Binary_Trees(10);
        tree.insertAtLeft(tree.root,5);
        tree.insertAtRight(tree.root, 15);
        tree.insertAtLeft(tree.root.left, 3);
        tree.insertAtRight(tree.root.left, 8);
        tree.insertAtLeft(tree.root.right, 12);
        Binary_Trees.preorder(tree.root);
        System.out.println();
        Binary_Trees.inorder(tree.root);
        System.out.println();
        Binary_Trees.postorder(tree.root);
    }
}