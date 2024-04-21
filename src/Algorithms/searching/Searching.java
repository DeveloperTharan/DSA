package Algorithms.searching;

public class Searching {
    public static void Print(int[] arr, String sortType) {
        System.out.print(sortType + ": ");
        System.out.print("[");
        for (var nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    /* Linear Searching */
    public static int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /* Binary Searching */
    public static int BinarySearch(int[] arr, int target) {
        int size = arr.length;

        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    /* Ternary Searching */
    /* Ternary Searching */
    public static int TernarySearch(int[] arr, int target) {
        int size = arr.length;
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (arr[mid1] == target) {
                return mid1;
            }
            if (arr[mid2] == target) {
                return mid2;
            }

            if (target < arr[mid1]) {
                right = mid1 - 1;
            } else if (target > arr[mid2]) {
                left = mid2 + 1;
            } else {
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }

        return -1;
    }
}
