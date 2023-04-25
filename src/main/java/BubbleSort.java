package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 2, 54};
        bubbleSortImproved(arr);
        //improvedBubbleSort(arr);
    }
    //number search
    public static void bubbleSortImproved(int[] arr) {
        boolean swapped = true; // Initialize swapped as true
        int n = arr.length; // Get length of array
        int i = 0; // Initialize loop variable i to 0
        while (swapped) { // Begin outer loop
            swapped = false; // Set swapped to false
            i++; // Increment i
            for (int j = 0; j < n - i; j++) { // Begin inner loop
                if (arr[j] > arr[j + 1]) { // If current element is greater than next element
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j]; // Store current element in temp variable
                    arr[j] = arr[j + 1]; // Replace current element with next element
                    arr[j + 1] = temp; // Replace next element with temp variable
                    swapped = true; // Set swapped to true
                }
            }
        }
        //improved number search
    public void sort() {
        boolean swapped = true;
        int n = size - 1;
        while (swapped) {
            swapped = false;
            
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        }
    }
        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }
    }
   //Words Sort
         public void bubbleSortWords() {
        boolean swapped = true; // Initialize swapped as true
        int n = arr.length - 1; // Get length of array
        while (swapped) { // Begin outer loop
            swapped = false; // Set swapped to false
            n--; // Increment i
            for (int j = 0; j < n; j++) { // Begin inner loop
                if (arr[j].compareTo(arr[j + 1])>0) { // If current element is greater than next element
                    // swap arr[j] and arr[j+1]
                    String temp = arr[j]; // Store current element in temp variable
                    arr[j] = arr[j + 1]; // Replace current element with next element
                    arr[j + 1] = temp; // Replace next element with temp variable
                    swapped = true; // Set swapped to true
                }
            }
        }
        
    }
    //Word Sort Improved
    public void sort(){
        boolean swapped =true;
        int n=size-1;        
        
        while(swapped && n>=0){
            
            swapped=false;
            for (int j = 0; j < n; j++) {
                if(arr[j].compareTo(arr[j+1])>0){
                     String temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        }
    }
    public static void bubbleSortByName(String[] names, int[] ages, String[] colors) {
    int n = names.length;
    boolean swapped;
    for (int i = 0; i < n - 1; i++) {
        swapped = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (names[j].compareTo(names[j + 1]) > 0) {
                // Swap names
                String tempName = names[j];
                names[j] = names[j + 1];
                names[j + 1] = tempName;
                // Swap ages
                int tempAge = ages[j];
                ages[j] = ages[j + 1];
                ages[j + 1] = tempAge;
                // Swap colors
                String tempColor = colors[j];
                colors[j] = colors[j + 1];
                colors[j + 1] = tempColor;
                swapped = true;
            }
        }
        if (!swapped) {
            // Array already sorted, exit loop
            break;
        }
    }
}
    //words
public void sortByName() {
        int n = size;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    
                    // Swap names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                    
                }
            }
        }
    }
}
