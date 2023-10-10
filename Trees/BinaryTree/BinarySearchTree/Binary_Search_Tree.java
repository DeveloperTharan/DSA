package DSA.Trees.BinaryTree.BinarySearchTree;

public class Binary_Search_Tree {
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
    Binary_Search_Tree(int val){
        root = new Node(val);
    }
    public void insert(int val){
        insert(root, val);
    }
    public Node insert(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        else if(root.data<val){
            root.right = insert(root.right,val);
        }
        else{
            root.left = insert(root.left, val);
        }
        return root;
    }
    public static void preorder(Node root){
        if(root!=null){
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        }
    }
    public static void inorder(Node root){
        if(root!=null){
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        }
    }
    public static void postorder(Node root){
        if(root!=null){
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
        }
    }
    public Node search(Node root, int val){
        if(root==null || root.data==val){
            return root;
        }
        if(val<root.data){
            return search(root.left, val);
        }
        if(val>root.data){
            return search(root.right, val);
        }
        return root;
    }
    public void delete(int val){
        root = delete(root, val);
    }
    public Node delete(Node root,int val){
        if(root==null){
            return root;
        }
        if(val<root.data){
            root.left = delete(root.left,val);
        }
        else if(val>root.data){
            root.right = delete(root.right,val);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            root.data = min(root.right);
            root.right = delete(root.right,root.data);
        }
        return root;
    }
    private int min(Node root) {
        int minval = root.data;
        while(root.left!=null){
            minval = root.left.data;
            root = root.left;
        }
        return minval;
    }
}
