package Searching;

public class BinarySearch {

    public static void main(String[] args) {

        int[] ints = {1, 2, 4, 5, 7, 9, 11};
        
        System.out.println("0 is at position: " + binarySearch(ints, 0));
        System.out.println("1 is at position: " + binarySearch(ints, 1));
        System.out.println("2 is at position: " + binarySearch(ints, 2));
        System.out.println("3 is at position: " + binarySearch(ints, 3));
        System.out.println("4 is at position: " + binarySearch(ints, 4));
        System.out.println("5 is at position: " + binarySearch(ints, 5));
        
    }

    private static int binarySearch(int[] arr, int numberToFind) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = arr[middlePosition];

            if (numberToFind == middleNumber) {
                return middlePosition;
            }
            if (numberToFind < middleNumber) {
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }
        return -1;
    }
    //words
    public int binarySearchForWord(String[] wordsArray, String target) {
        int left = 0;
        int right = wordsArray.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int cmp = target.compareTo(wordsArray[middle]);

            if (cmp == 0) {
                return middle;
            } else if (cmp < 0) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1; // target not found in array
    }
}
//int index = bs.binarySearchForWord(wordsArray, target);
// System.out.println("Index of '" + target + "' in array: " + index);
}

