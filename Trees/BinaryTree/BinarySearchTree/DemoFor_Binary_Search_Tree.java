package DSA.Trees.BinaryTree.BinarySearchTree;

public class DemoFor_Binary_Search_Tree {
    public static void main(String[] args) {
        Binary_Search_Tree bst = new Binary_Search_Tree(50);

        bst.insert(20);
        bst.insert(70);
        bst.insert(10);
        bst.insert(25);
        bst.insert(60);
        bst.insert(90);
        Binary_Search_Tree.preorder(bst.root);
        System.out.println();
        Binary_Search_Tree.inorder(bst.root);
        System.out.println();
        Binary_Search_Tree.postorder(bst.root);
        System.out.println();
        if(bst.search(bst.root,50)==null){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found");
        }

        bst.delete(70);
        Binary_Search_Tree.inorder(bst.root);
    }  
}
