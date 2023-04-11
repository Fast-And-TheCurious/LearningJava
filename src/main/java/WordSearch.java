
package Searching;

public class WordSearch {
    
    public static int search(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i; // target word found at index i
            }
        }
        return -1; // target word not found
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "orange", "grape", "kiwi"};
        String target = "orange";
        int index = search(arr, target);
        if (index == -1) {
            System.out.println("Target word not found.");
        } else {
            System.out.println("Target word found at index " + index);
        }
    }
}

