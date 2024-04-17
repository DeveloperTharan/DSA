package Algorithms.sorting;

public class Main {
    public static void main(String[] args) {
        int[] data = { 9, 5, 3, 7, 2, 1 };

        Sorting sort = new Sorting();

        System.out.println(sort.BubleSort(data));
        System.out.println(sort.SelectionSort(data));
    }
}