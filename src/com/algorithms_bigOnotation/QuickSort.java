package com.algorithms_bigOnotation;

public class QuickSort {
    // Partitioning the array and returning the pivot index
    public static int partition (int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    // Recursive function to perform quicksort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // Sort the left partition
            quickSort(arr, low, pivotIndex - 1);
            // Sort the right partition
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Testing quickSort
    public static void main(String[] args) {
        int[] arr = {6, 2, 7, 13, 1, 5, 18, 3};

        System.out.println("Array before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sort the array using quickSort
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Array after sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
