package bubblesort;

import java.util.Arrays;

public class BubbleSortTest {

    public static void main(String[] args) {

        // 1. Random array
        int[] randomArr = {5, 1, 9, 3, 7};
        test("Random Array", randomArr);

        // 2. Already sorted (best-case)
        int[] sortedArr = {1, 2, 3, 4, 5};
        test("Already Sorted Array", sortedArr);

        // 3. Descending order (worst-case)
        int[] reverseArr = {9, 7, 5, 3, 1};
        test("Descending Array", reverseArr);

        // 4. All identical
        int[] identicalArr = {4, 4, 4, 4, 4};
        test("Identical Elements Array", identicalArr);

        // 5. Edge case: empty array
        int[] emptyArr = {};
        test("Empty Array", emptyArr);

        // 6. Edge case: single element
        int[] singleArr = {42};
        test("Single Element Array", singleArr);
    }

    private static void test(String label, int[] arr) {
        System.out.println("\n--- " + label + " ---");
        System.out.println("Original: " + Arrays.toString(arr));

        int[] copy1 = arr.clone();
        int[] copy2 = arr.clone();

        BubbleSort.bubbleSort(copy1);
        System.out.println("Basic Sorted:     " + Arrays.toString(copy1));

        BubbleSort.bubbleSortOptimized(copy2);
        System.out.println("Optimized Sorted: " + Arrays.toString(copy2));
    }

}

