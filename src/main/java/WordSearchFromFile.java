
package Searching;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearchFromFile {
    
    public static int search(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i; // target word found at index i
            }
        }
        return -1; // target word not found
    }

    public static void main(String[] args) {
        File file = new File("words.txt"); // assuming file name is "words.txt"
        try {
            Scanner scanner = new Scanner(file);
            int numWords = 0;
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                numWords++;
            }
            scanner.close();
            scanner = new Scanner(file);
            String[] words = new String[numWords];
            int[] frequencies = new int[numWords]; // assuming a parallel array for word frequencies
            int index = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                words[index] = parts[0];
                frequencies[index] = Integer.parseInt(parts[1]); // assuming word frequency is separated by a space
                index++;
            }
            scanner.close();
            String target = "orange";
            index = search(words, target);
            if (index == -1) {
                System.out.println("Target word not found.");
            } else {
                System.out.println("Target word found at index " + index + " with frequency " + frequencies[index]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}

