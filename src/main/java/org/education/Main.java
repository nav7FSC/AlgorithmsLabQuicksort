package org.education;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    /**
     * Displays the array elements on a single line, separated by spaces.
     *
     * @param a the array to be displayed
     */
    public static void showArray(int[] a) {
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Swaps two elements in the array.
     *
     * @param a      the array containing elements to be swapped
     * @param index1 the index of the first element
     * @param index2 the index of the second element
     */
    public static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    /**
     * Partitions the array using the last element as a pivot.
     *
     * @param a    the array to be partitioned
     * @param low  the starting index
     * @param high the ending index
     * @return the index of the pivot element
     */
    public static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, high);
        return i + 1;
    }

    /**
     * Implements the quicksort algorithm using recursion.
     *
     * @param a    the array to be sorted
     * @param low  the starting index
     * @param high the ending index
     */
    public static void quicksort(int[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            quicksort(a, low, pi - 1);
            quicksort(a, pi + 1, high);
        }
    }

    /**
     * Partitions the array using a random pivot and returns the index of the pivot.
     *
     * @param a    the array to be partitioned
     * @param low  the starting index
     * @param high the ending index
     * @return the index of the random pivot element
     */
    public static int randomizedPartition(int[] a, int low, int high) {
        Random rand = new Random();
        int pivotIndex = rand.nextInt(high - low + 1) + low;
        swap(a, pivotIndex, high);
        return partition(a, low, high);
    }

    /**
     * Implements randomized quicksort.
     *
     * @param a    the array to be sorted
     * @param low  the starting index
     * @param high the ending index
     */
    public static void randomizedQuicksort(int[] a, int low, int high) {
        if (low < high) {
            int pi = randomizedPartition(a, low, high);
            randomizedQuicksort(a, low, pi - 1);
            randomizedQuicksort(a, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        // Part 5: Testing with an unsorted array
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        System.out.println("Unsorted array:");
        showArray(arr);

        quicksort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        showArray(arr);
        System.out.println("----------------------------------------");

        // Part 6: Testing with random numbers
        Random rand = new Random();
        int[] randomArray = new int[50];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(1000); // Generates random numbers between 0 and 999
        }

        System.out.println("Random array before sorting:");
        showArray(randomArray);

        quicksort(randomArray, 0, randomArray.length - 1);
        System.out.println("Random array after sorting:");
        showArray(randomArray);
        System.out.println("----------------------------------------");

        // Part 7: Comparing int[] array and ArrayList
        int[] array1 = randomArray.clone();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int value : array1) {
            arrayList.add(value);
        }

        quicksort(array1, 0, array1.length - 1);
        arrayList.sort(null);

        boolean arraysEqual = true;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != arrayList.get(i)) {
                arraysEqual = false;
                break;
            }
        }

        if (arraysEqual) {
            System.out.println("The arrays are the same.");
        } else {
            System.out.println("The arrays are different.");
        }
        System.out.println("----------------------------------------");

        // Part 8: Testing randomized quicksort
        int[] randomizedArray = randomArray.clone();
        randomizedQuicksort(randomizedArray, 0, randomizedArray.length - 1);
        System.out.println("Randomized quicksort result:");
        showArray(randomizedArray);
    }
}