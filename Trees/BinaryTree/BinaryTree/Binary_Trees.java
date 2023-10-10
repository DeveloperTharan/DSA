package DSA.Trees.BinaryTree.BinaryTree;

public class Binary_Trees{
    Node root;
    class Node{
       int data;
       Node right;
       Node left;
       Node(int val){
        data = val;
        right = null;
        left = null;
       }
    }
    Binary_Trees(int val){
        root = new Node(val);
    }
    public void insertAtLeft(Node r,int val) {
        Node newNode = new Node(val);
        r.left = newNode;
    }
     public void insertAtRight(Node r,int val) {
        Node newNode = new Node(val);
        r.right = newNode;
    }
    public static void preorder(Node root) {
         if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
     public static void inorder(Node root) {
         if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
     public static void postorder(Node root) {
         if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
}
