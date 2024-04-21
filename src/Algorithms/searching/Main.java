package Algorithms.searching;

public class Main {
    public static void main(String[] args) {
        int[] data = {5, 3, 9, 2, 8, 3, 7};

        int linearSearch = Searching.LinearSearch(data, 7);
        int binarySearch = Searching.BinarySearch(data, 7);
        int ternarySearch = Searching.TernarySearch(data, 8);

        System.out.println(linearSearch);
        System.out.println(binarySearch);
        System.out.println(ternarySearch);
    }
}
