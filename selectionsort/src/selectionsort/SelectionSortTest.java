package selectionsort;

import java.util.Arrays;

public class SelectionSortTest {

    public static void main(String[] args) {

        // 1. Random array
        int[] randomArr = {5, 2, 9, 1, 6};
        test("Random Array", randomArr);

        // 2. Already sorted
        int[] sortedArr = {1, 2, 3, 4, 5};
        test("Sorted Array", sortedArr);

        // 3. Descending order
        int[] reverseArr = {9, 7, 5, 3, 1};
        test("Descending Array", reverseArr);

        // 4. All identical elements
        int[] identicalArr = {4, 4, 4, 4, 4};
        test("Identical Elements", identicalArr);

        // 5. Empty array (edge case)
        int[] emptyArr = {};
        test("Empty Array", emptyArr);

        // 6. Single element array (edge case)
        int[] singleArr = {42};
        test("Single Element Array", singleArr);
    }

    private static void test(String label, int[] arr) {
        System.out.println("\n--- " + label + " ---");
        System.out.println("Original: " + Arrays.toString(arr));

        int[] copy = arr.clone();

        SelectionSort.selectionSort(copy);
        System.out.println("Sorted:   " + Arrays.toString(copy));
    }
}
