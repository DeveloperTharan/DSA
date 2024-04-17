package Algorithms.sorting;

public class Sorting {
    /* Bubble sort */
    public int[] BubleSort(int[] array) {
        int size = array.length;
        int temp;

        if (size <= 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /* Selection sort */
    public int[] SelectionSort(int[] array) {
        int size = array.length;
        int temp;
        int minIndex = -1;

        if (size <= 0) {
            throw new IllegalArgumentException();
        }

        for(int i=0; i<size-1; i++){
            minIndex = i;
            for(int j=i+1; j<size; j++){
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}