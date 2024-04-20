package Algorithms.sorting;

public class Main {
    public static void main(String[] args) {
        int[] data = { 9, 5, 3, 7, 2, 1 };

        var bubledsort = Sorting.BubleSort(data);
        var selectionsort = Sorting.SelectionSort(data);
        var insertionSort = Sorting.InsertionSort(data);
        var mergSort = Sorting.MergeSort(data);

        System.out.print("BubbledSort: ");
        for (var nums : bubledsort) {
            System.out.print(nums + " ");
        }

        System.out.println();

        System.out.print("SelectionSort: ");
        for (var nums : selectionsort) {
            System.out.print(nums + " ");
        }

        System.out.println();

        System.out.print("InsertionSort: ");
        for (var nums : insertionSort) {
            System.out.print(nums + " ");
        }

        
        System.out.println();

        System.out.print("MergeSort: ");
        for (var nums : mergSort) {
            System.out.print(nums + " ");
        }
    }
}