package HashTable;

public class Main {
    public static void main(String[] args) {
        var map = new HashTable();
        /* var res1 = map.findFirstNonRepeatingChar("I am IronMan");
        System.out.println(res1);
        var res2 = map.findFirstRepeatedChar("I am IronMan");
        System.out.println(res2); */
        map.Put(6, "A");
        map.Put(8, "B");
        map.Put(11, "C");
        map.remove(6);
        System.out.println(map.get(6));
    }
}