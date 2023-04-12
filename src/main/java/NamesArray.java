package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NamesArray {

    private String[] arr;
    private int size;

    public NamesArray() {
        arr = new String[100];
        size = 0;
        
        
        File f=new File("names.txt");
        try {
            Scanner fileScanner= new Scanner(f);
            
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String name = lineSc.next();
                                
                arr[size] = name;
                size++;
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NamesArray.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sort(){
        boolean swapped =true;
        int n=size-1;
        int i=0;
        
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
            
   
    public int search(String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i; // target word found at index i
            }
        }
        return -1; // target word not found
    }
    

    public String toString() {
        String out = "";
        for (int j = 0; j < size; j++) {
            out += arr[j] + " ";
        }
        return out;
    }

}
