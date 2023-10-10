package DSA.Trees.AVLTree;

public class AVL_tree {
    Node root;

    class Node{
        int data;
        Node right;
        Node left;
        int height;

        Node(int val){
            data = val;
            right = null;
            left = null;
            height = 0;
        }
    }
    public AVL_tree(int val){
        insert(root, val);
    }

    public int getheight(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public int max(int a,int b){
        return a>b?a:b;
    }

    private int getbalancefactor(Node node){
        if(node==null){
            return 0;
        }
        return getbalancefactor(node.left)-getbalancefactor(node.right);
    }

    public void insert(int val){
        root = insert(root, val);
    }
    public Node insert(Node node,int val){
        if(node==null){
            return new Node(val);
        }
        if(node.data<val){
            node.right = insert(node.right,val);
        }
        else if(node.data>val){
            node.left = insert(node.left, val);
        }
        else{
            return node;
        }
        node.height = max(getheight(node.left),getheight(node.right))+1;
        int balfact = getbalancefactor(node);

        //LL case:
        if(balfact>1 && val<node.left.data){
            return RightRotate(node);
        }

        //LR case:
        if(balfact>1 && val>node.left.data){
            node.left = LeftRotate(node.left);
            return RightRotate(node);
        }

        //RR case:
        if(balfact>-1 && val>node.right.data){
            return LeftRotate(node);
        }

        //RL case:
        if(balfact>-1 && val<node.right.data){
            node.right = RightRotate(node.right);
            return LeftRotate(node);
        }
        return node;
    }

     private Node RightRotate(Node z) {
        Node y = z.left;
        Node t3 = y.right;

        y.right = z;
        z.left = t3;

        z.height = max(getheight(z.left),getheight(z.right))+1;
        y.height = max(getheight(y.left),getheight(y.right))+1;

        return y;
    }
    private Node LeftRotate(Node z) {
        Node y = z.right;
        Node t3 = y.left;

        y.left = z;
        z.right = t3;

        z.height = max(getheight(z.left),getheight(z.right))+1;
        y.height = max(getheight(y.left),getheight(y.right))+1;

        return y;
    }


    public static void inorder(Node root){
        if(root!=null){
        inorder(root.left);
        System.out.print(root.data+"Height is: "+root.height);
        inorder(root.right);
        }
    }
}
