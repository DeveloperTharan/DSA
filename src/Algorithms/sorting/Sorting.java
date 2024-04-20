package Algorithms.sorting;

public class Sorting {
    /* Bubble sort */
    public static int[] BubleSort(int[] arr) {
        int size = arr.length;
        int temp;

        if (arr == null || size <= 1) {
            return arr;
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    /* Selection sort */
    public static int[] SelectionSort(int[] arr) {
        int size = arr.length;
        int temp;
        int minIndex = -1;

        if (arr == null || size <= 1) {
            return arr;
        }

        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    /* insertionSort */
    public static int[] InsertionSort(int[] arr) {
        int size = arr.length;

        if (arr == null || size <= 1) {
            return arr;
        }

        for (int i = 1; i < size; ++i) {
            int currentValue = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > currentValue) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = currentValue;
        }
        return arr;
    }

    /* MergeSort */
    public static int[] MergeSort(int[] arr) {
        int size = arr.length;
        
        if (arr == null || size <= 1){
            return arr;
        }

        int midIndex = size / 2;

        int[] left = new int[midIndex];
        int[] right = new int[size - midIndex];

        for (int i = 0; i < midIndex; i++) {
            left[i] = arr[i];
        }

        for (int i = midIndex; i < size; i++) {
            right[i - midIndex] = arr[i];
        }

        left = MergeSort(left);
        right = MergeSort(right);

        return Merge(left, right);
    }

    private static int[] Merge(int[] left, int[] right) {
        int leftSize = left.length;
        int rightSize = right.length;

        int[] mergedArray = new int[leftSize + rightSize];

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                mergedArray[k++] = left[i++];
            } else {
                mergedArray[k++] = right[j++];
            }
        }

        while (i < leftSize) {
            mergedArray[k++] = left[i++];
        }

        while (j < rightSize) {
            mergedArray[k++] = right[j++];
        }

        return mergedArray;
    }

    /* QuickSort */
}