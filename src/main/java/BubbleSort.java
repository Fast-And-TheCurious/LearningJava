package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 2, 54};
        bubbleSortImproved(arr);
        //improvedBubbleSort(arr);
    }

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
        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }
    }
    public static void bubble(int[]arr){
    boolean swapped =true;
    int n = arr.length;
    int i=0;
    while(swapped){
        swapped=false;
        i++;
        for (int j = 0; j < n-i; j++) {
            if (arr[j]>arr[j+1]) {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
            }
        }
    }    
    }
    public static void bubble2(int[]arr){
        boolean swapped=true;
        int i=0;
        int n=arr.length;
            while(swapped){
                swapped=false;
                i++;
                for (int j = 0; j < n-i; j++) {
                    if (arr[j]>arr[j+1]) {
                        int temp = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        swapped=true;
                    }
                }
            }
    }
    public static void bubble3(int[]arr){
    
            boolean swapped =true;
            int n=arr.length;
            int i =0;
            while(swapped){
                swapped=false;
                i++;
                for (int j = 0; j < n-i; j++) {
                    if (arr[j]>arr[j+1]) {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        swapped=true;
                    }
                }
            }                   
    }
     private static void improvedBubbleSort(int[] array) {
        boolean swapped = true;
        int n = array.length;
        int i = 0;
        while (swapped) {
            swapped = false;
            i++;
            for (int j = 0; j < n - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            System.out.println(array[j]);
        }
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
