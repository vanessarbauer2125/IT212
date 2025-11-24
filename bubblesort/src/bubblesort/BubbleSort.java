package bubblesort;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {

        // Outer loop runs n-1 passes
        for (int i = 0; i < arr.length - 1; i++) {

            // Inner loop compares adjacent pairs
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // Swap if elements are out of order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Optimized Bubble Sort:
     * Includes a swap flag that terminates early if no swaps occur.
     * This greatly improves performance in the best-case scenario.
     */
    public static void bubbleSortOptimized(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // at least one swap happened
                }
            }

            // If no swaps occurred, array is sorted → stop early
            if (!swapped) {
                break;
            }
        }
    }


}
