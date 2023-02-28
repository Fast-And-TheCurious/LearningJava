/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author bryantm
 */
public class ArrayInsertionSortNumbers {

    public static void main(String[] args) {

        int[] arr = {1, 56, 6, 7, 8};
        
        for (int firstPoint = 0; firstPoint < arr.length; firstPoint++) {
            for (int j = firstPoint + 1; j < arr.length; j++) {
                if (arr[j] < arr[firstPoint]) {
                    int temp=arr[firstPoint];
                    arr[firstPoint] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println(arr[i]);
        }
    }
}
