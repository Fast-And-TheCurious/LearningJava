package Searching;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileToArrayWordsAndNumberSearch {
    public static void main(String[] args) {
        String filename = "input.txt"; // replace with the name of your input file
        File inputFile = new File(filename);

        try {
            Scanner scanner = new Scanner(inputFile);

            // create arrays to store the data
            int[] numbers = new int[100];
            String[] words = new String[100];

            int index = 0;

            // read data from file and store in arrays
            while (scanner.hasNext()) {
                String input = scanner.next();

                // check if input is a number
                if (input.matches("\\d+")) {
                    numbers[index] = Integer.parseInt(input);
                } else {
                    words[index] = input;
                }

                index++;
            }

            scanner.close();

            // print the arrays
            System.out.println("Numbers:");
            for (int i = 0; i < index; i++) {
                System.out.print(numbers[i] + " ");
            }

            System.out.println("\nWords:");
            for (int i = 0; i < index; i++) {
                System.out.print(words[i] + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
