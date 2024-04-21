package Algorithms.sorting;

public class Main {
    public static void main(String[] args) {
        int[] data = { 9, 5, 3, 7, 2, 1 };

        var bubledsort = Sorting.BubleSort(data);
        var selectionsort = Sorting.SelectionSort(data);
        var insertionSort = Sorting.InsertionSort(data);
        var mergSort = Sorting.MergeSort(data);
        var quickSort = Sorting.QuickSort(data);

        Sorting.Print(bubledsort, "BubbledSort");
        Sorting.Print(selectionsort, "selectionsort");
        Sorting.Print(insertionSort, "insertionSort");
        Sorting.Print(mergSort, "mergSort");
        Sorting.Print(quickSort, "quickSort");
    }
}