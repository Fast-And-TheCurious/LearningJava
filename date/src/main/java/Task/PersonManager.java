package Task;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonManager {

    private Person[] people;
    private int size;

    public PersonManager() {
        people = new Person[50];
        size = 0;
        File f = new File("people.txt");
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                
                String name = lineSc.next();
                String gender = lineSc.next();
                String birthYear = lineSc.next();

                DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate year = LocalDate.parse(birthYear, inputFormatter);

                people[size] = new Person(name, gender, year);
                size++;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public String toString() {
        String out="";
        for (int i = 0; i < size; i++) {
            out+="\n"+people[i];
        }
        return out;        
    }
    
    public void Sort(){
        boolean swapped = true;
        int n = size-1;
        while(swapped){
            swapped=false;
            for (int i = 0; i < n; i++) {
                if (people[i].getBirthYear().isAfter(people[i+1].getBirthYear())) {
                    Person temp= people[i];
                    people[i]=people[i+1];
                    people[i+1]=temp;
                }
            }
            n--;
        }    
        
    }    

}
