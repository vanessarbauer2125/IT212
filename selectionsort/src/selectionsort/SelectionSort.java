package selectionsort;

public class SelectionSort {

    public static void selectionSort(int[] arr) {

        // Loop through each index where the next minimum should be placed
        for (int i = 0; i < arr.length - 1; i++) {

            // Assume the current index has the smallest value
            int minIndex = i;

            // Search for the actual minimum in the remaining unsorted portion
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // found a new minimum
                }
            }

            // Swap the found minimum with the element at position i
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
