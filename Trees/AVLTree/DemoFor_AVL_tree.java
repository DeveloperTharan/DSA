package DSA.Trees.AVLTree;

public class DemoFor_AVL_tree {
    public static void main(String[] args) {
        AVL_tree avl = new AVL_tree(50);
        avl.insert(20);
        avl.insert(60);
        avl.insert(10);
        avl.insert(30);
        avl.insert(40);
        AVL_tree.inorder(avl.root);
    }  
}
