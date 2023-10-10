package DSA.Trees;

public class Tries {
    
    public static final char Max_Alp = 26;

    static class Node{
        Node[] children;
        boolean eow; //endOfword

        public Node(){
            children = new Node[Max_Alp];
              for(int i=0; i<Max_Alp; i++){
                children[i] = null;
              }
            eow = false;  
        } 
    }
    static Node root = new Node();

    public static void insert(String word){
        Node crr = root;
        for(int i=0; i<=word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if(root.children[idx]==null){
                root.children[idx] = new Node();
            }
            if(i==word.length()-1){
                root.children[idx].eow = true;
            }
            crr = root.children[idx];
        }
    }
    public static boolean search(String key){
        Node crr = root;
        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i) - 'a';
            Node node = root.children[idx];

             if(node==null){
                return false;
            }
            if(i==key.charAt(i)-1 && root.children[idx].eow==false){
                return false;
            }
            crr = root.children[idx];
        }
        return false;
    }

    public static void main(String[] args) {
        String [] words = {"the","a","there","their","any"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("an"));
    }
}    
