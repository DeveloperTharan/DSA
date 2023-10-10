package DSA.Algorithms.SortingAlgo;

import java.util.Arrays;

public class Sorting_Algorithms {
    //Selection Sort
    public static void selectionshort(int arr[]){
        for(int i= 0; i<arr.length; i++){
            int min = arr[i];
            int minindex = i;
            for(int j=i; j<arr.length; j++){
                if(arr[j]<min){
                    min = arr[j];
                    minindex = j;
                }
            }
            //swaping process
            int temp = arr[i];
            arr[i] = min;
            arr[minindex] = temp;
        }
    }

    //Bubble Sort
    public static void Bubbleshort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<arr.length-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //Insertion Sort
    public static void Insertionsort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }

    //Merge sort
    public static int[] Mergesort(int[] arr){
        //recursion process
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = Mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = Mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        //merge method call
        return merge(left,right);
    }
    //merge method
    private static int[] merge(int[] left, int[] right) {
        int[] joind = new int[left.length+right.length];
        int i=0, j=0, k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                joind[k] = left[i];
                k++;
                i++;
            }
            else{
                joind[k] = right[j];
                k++;
                j++;
            }
        }
        while(i<left.length){
            joind[k] = left[i];
            k++;
            i++;
        }
        while(j<right.length){
            joind[k] = right[j];
            k++;
            j++;
        }
        return joind;
    }

    //Quick sort
    public static void Quicksort(int[] arr, int low , int high){
        if(low>=high){
            return;
        }
        int start = low;
        int end = high;
        int mid = (start+end)/2;
        int pivote = arr[mid];

        while(start<=end){
            while(arr[start]<pivote){
                start++;
            }
            while(arr[end]>pivote){
                end--;
            }
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}
