package Algorithms.sorting;

public class Sorting {
    public static void Print(int[] arr, String sortType) {
        System.out.print(sortType + ": ");
        System.out.print("[");
        for (var nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    /* Bubble sort */
    public static int[] BubleSort(int[] arr) {
        int size = arr.length;

        if (arr == null || size <= 1) {
            return arr;
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, i);
                }
            }
        }
        return arr;
    }

    /* Selection sort */
    public static int[] SelectionSort(int[] arr) {
        int size = arr.length;
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
            swap(arr, minIndex, i);
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

        if (arr == null || size <= 1) {
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
    public static int[] QuickSort(int[] arr) {
        int size = arr.length;

        if (arr == null || size <= 1) {
            return arr;
        }

        return QuickSort(arr, 0, size - 1);
    }

    private static int[] QuickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return arr;
        }

        int pivot = arr[high];
        int left = low;
        int right = high - 1;

        while (left <= right) {
            if (arr[left] > pivot && arr[right] < pivot) {
                swap(arr, left, right);
            }
            if (arr[left] <= pivot) {
                left++;
            }
            if (arr[right] >= pivot) {
                right--;
            }
        }

        swap(arr, left, high);

        QuickSort(arr, low, left - 1);
        QuickSort(arr, left + 1, high);

        return arr;
    }

    /* swaping */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}