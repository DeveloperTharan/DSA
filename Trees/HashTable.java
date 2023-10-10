package DSA.Trees;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashTable {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("Dharani",12);
        map.put("Dhina",49);
        map.put("Ashok",8);
        map.put("Ajay",5);
        Set<String> data = map.keySet();
        for(String i : data){
            System.out.println(map.get(i));
            System.out.println(i.hashCode()%10);
        }
        Set<Map.Entry<String,Integer>> data1 = map.entrySet();
        for(Map.Entry<String,Integer> i : data1){
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
}
