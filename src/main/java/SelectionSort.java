package Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 8,3, 45, 2, 54,573,5,87};
        selectionSortImproved(arr);
    }

    public static void selectionSortImproved(int[] arr) {
        int n = arr.length; // Get length of array
        for (int i = 0; i < n - 1; i++) { // Begin outer loop
            int minIndex = i; // Set minIndex to i
            for (int j = i + 1; j < n; j++) { // Begin inner loop
                if (arr[j] < arr[minIndex]) { // If current element is less than minimum element
                    minIndex = j; // Update minIndex to the index of the current element
                }
            }
            // swap arr[i] and arr[minIndex]
            int temp = arr[i]; // Store current element in temp variable
            arr[i] = arr[minIndex]; // Replace current element with minimum element
            arr[minIndex] = temp; // Replace minimum element with temp variable
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
