package Arrays;

import java.util.Arrays;

public class PersonUI {

    public static void main(String[] args) {
        Person p=new Person();
        //System.out.println(p.searchAge(19)); 
        //p.insertIntoSortedArray(arr, 4);
        //p.sortByAge();//Sort by age
      // p.sortByColors();
      // p.sortByName();
        //System.out.println(p.searchName("Wian")); 
        
        //p.addWordToArray("Jem");
        
       // p.addIntegerToArray(300);
        p.addStringToArray("Boooooo");
        //p.deleteIntFromArray(19);
        p.deleteStringFromArray("Wian");
      System.out.println(p.toString());     
    }
    
}

