package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Person {

    private int size = 0;
    private String[] names;
    private int[] ages;
    private String[] colors;

    public Person() {
        File f = new File("array.txt");
        ages = new int[150];
        colors = new String[150];
        names = new String[150];
        size = 0;
        try {
            Scanner fileScan = new Scanner(f);
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();

                Scanner lineSc = new Scanner(line).useDelimiter("#");

                String name = lineSc.next();
                int num = lineSc.nextInt();
                String color = lineSc.next();

                names[size] = name;
                colors[size] = color;
                ages[size] = num;

                size++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        String out = "";
        String outAges = "";
        String outNames = "";
        String outColors = "";
        for (int i = 0; i < size; i++) {
            outAges += ages[i] + ", ";
            outNames += names[i] + ", ";
            outColors += colors[i] + ", ";
        }
        out = "Names: " + outNames + "\nAges: " + outAges + "\nColors: " + outColors;
        return out;
    }

    public void sortByAge() {
        boolean swapped = true;
        int n = size - 1;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < n; i++) {
                if (ages[i] > ages[i + 1]) {

                    int tempA = ages[i];
                    ages[i] = ages[i + 1];
                    ages[i + 1] = tempA;

                    String tempN = names[i];
                    names[i] = names[i + 1];
                    names[i + 1] = tempN;

                    String tempC = colors[i];
                    colors[i] = colors[i + 1];
                    colors[i + 1] = tempC;

                    swapped = true;
                }
            }
            n--;
        }
    }

    public void sortByName() {
        int n = size;
        for (int i = 0; i < n - 1; i++) {
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
                }
            }
        }
    }

    public void sortByColors() {
        int n = size;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (colors[j].compareTo(colors[j + 1]) > 0) {
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
                }
            }
        }
    }

    public int searchAge(int value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (ages[i] == value) {
                index = 1;
            }
        }
        return index;
    }
    public int searchName(String value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (names[i].equals(value)) {
                index = 1;
            }
        }
        return index;
    }
public int binearySearchInt(int target){
    int low=0;
    int high= size-1;
    while(low<=high){
        
    int middlePosition= (low+high)/2;
    int middleElement= ages[middlePosition]; 
    
        if (target==middleElement) {
            return middleElement;
        }
        if (target<middleElement) {
            high=middleElement-1;
        }else{
            low=middleElement+1;
        }        
    }
    return -1;
}
    public int binarySearchForNames(String target) {
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int cmp = target.compareTo(names[middle]);

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

    
    
    
    
    
    
    public void deleteStringFromArray(String element) {
    // Find the index of the element to be deleted
    int index = -1;
    for (int i = 0; i < size; i++) {
        if (names[i].equals(element)) {//integer--- if (ages[i] == element) {
            index = i;
            break;
        }
    }// If the element was not found, return without modifying the array
    if (index == -1) {
        return;
    }// Move all the elements of the original array one position to the left
    for (int i = index; i < names.length - 1; i++) {
        names[i] = names[i + 1];
    }// Resize the original array by one
    names = Arrays.copyOf(names, names.length - 1);
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    public void deleteIntFromArray(int element) {
        // Find the index of the element to be deleted
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (ages[i] == element) {
                index = i;
                break;
            }
        }

        // If the element was not found, return without modifying the array
        if (index == -1) {
            return;
        }

        // Move all the elements of the original array one position to the left
        for (int i = index; i < ages.length - 1; i++) {
            ages[i] = ages[i + 1];
        }

        // Resize the original array by one
        ages = Arrays.copyOf(ages, ages.length - 1);
    }
*/
    
    
    
    
    
    
    
    
    
    public void addStringToArray(String element) {//--integer int element
        // Find the length of the original array
        int n = size;
        // Resize the original array by one
        names = Arrays.copyOf(names, n + 1);
        // Move all the elements of the original array one position to the right
        for (int i = n - 1; i >= 0; i--) {
            names[i + 1] = names[i];
        }
        // Add the new element to the beginning of the array
        names[0] = element;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
/*
    public void addIntegerToArray(int element) {
        // Find the length of the original array
        int n = size;

        // Resize the original array by on
        ages = Arrays.copyOf(ages, n + 1);

        // Move all the elements of the original array one position to the right
        for (int i = n - 1; i >= 0; i--) {
            ages[i + 1] = ages[i];
        }

        // Add the new element to the beginning of the array
        ages[0] = element;
    }
*/
    
    public void sortName() {//for Strings
        int n = size;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
    }
    public void sortInt() {
        boolean swapped = true;
        int n = size - 1;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < n; i++) {
                if (ages[i] > ages[i + 1]) {
                    int temp = ages[i];
                    ages[i] = ages[i + 1];
                    ages[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        }
    }  
    private int binarySearch(int numberToFind) {
        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = ages[middlePosition];

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

}
