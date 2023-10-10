package DSA.Algorithms.SortingAlgo;

import java.util.Arrays;

public class DemoFor_Sorting_algo {
    public static void main(String[] args) {
       int [] arr = {2,5,9,3,6,7,4,1,8};
       Sorting_Algorithms.selectionshort(arr);
       System.out.println(Arrays.toString(arr));

       Sorting_Algorithms.Bubbleshort(arr);
       System.out.println(Arrays.toString(arr));

       Sorting_Algorithms.Insertionsort(arr);
       System.out.println(Arrays.toString(arr));

       Sorting_Algorithms.Mergesort(arr);
       System.out.println(Arrays.toString(arr));

       Sorting_Algorithms.Quicksort(arr, 0, arr.length-1);
       System.out.println(Arrays.toString(arr));
    }
}
