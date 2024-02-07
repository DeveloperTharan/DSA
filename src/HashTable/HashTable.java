package HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class HashTable {
    // A Green Apple
    public char findFirstNonRepeatingChar(String string) {
        Map<Character, Integer> map = new HashMap<>();

        String str = string.replaceAll("\\s+", "").toLowerCase();

        char[] charArray = str.toCharArray();

        for (var ch : charArray) {
            var count = map.containsKey(ch) ? 1 : 0;
            map.put(ch, count + 1);
        }

        for (var ch : charArray) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }

    // green apple
    public char findFirstRepeatedChar(String string) {
        Set<Character> set = new HashSet<>();

        String str = string.replaceAll("\\s+", "").toLowerCase();

        char[] charArray = str.toCharArray();

        for (var ch : charArray) {
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }

        return Character.MAX_VALUE;
    }

    private class Entries {
        private int key;
        private String value;

        public Entries(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entries>[] entries = new LinkedList[5];

    private int hash(int key) {
        return key % entries.length;
    }

    public void Put(int key, String value) {
        int index = hash(key);
        if (entries[index] == null) {
            entries[index] = new LinkedList<>();
        }

        for (var entry : entries[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        var entry = new Entries(key, value);
        entries[index].addLast(entry);
    }

    public String get(int key) {
        int index = hash(key);
        if (entries[index] != null) {
            for (var entry : entries[index]) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    public void remove(int key){
        int index = hash(key);
        if(entries[index] == null){
            throw new IllegalArgumentException();
        }
        for(var entry : entries[index]){
            if(entry.key == key){
                entries[index].remove(entry);
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
