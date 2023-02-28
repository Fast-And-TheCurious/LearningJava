package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {

    public static void main(String[] args) {
        boolean has5 = false;
        double sum = 0;
        double high = 0;

        double[] numbers = {1, 465, 6, 7.6, 43, 5, 8, 9, 0, 343, 5465, 65};

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] > high) {
                high = numbers[i];
            }
            if (numbers[i] == 5) {
                has5 = true;
            }
        }

        double ave = sum / numbers.length;
        System.out.println("Contains 5: " + has5);
        System.out.println("Average: " + ave);
        System.out.println("Highest: " + high);

        //string array 5 names
        // average length
        //most alfabetical name
        String[] names = {"Bob", "Steve", "Josh", "Audan", "Wian"};

        int totalLen = 0;
        String mostAl = " ";
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            totalLen += name.length();
            Scanner sc = new Scanner(name);
        }
        System.out.println("Average length: " + totalLen / names.length);

        int[] arr = {8, 56, 6, 7, 1, 8, 4, 9, 4};

        int onePointer = arr[0];
        int secondPointer = arr[1];
        var newA = Arrays.toString(arr);

        for (int i = 0; i < arr.length; i++) {
               for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i]){                
                   arr[i]=arr[j];
                   arr[j]=arr[i];
                }
            }
        }
        System.out.println(arr);
    }
}
