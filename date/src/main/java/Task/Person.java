package Task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private String name;    
    private String gender;
    private LocalDate birthdate;

    public Person(String name, String gender, LocalDate birthYear) {
        this.name = name;
        this.gender = gender;
        this.birthdate = birthYear;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthYear() {
        return birthdate;
    }

    public void setBirthYear(LocalDate birthYear) {
        this.birthdate = birthYear;
    }

    @Override
    public String toString() {        
       

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String date = birthdate.format(outputFormatter);

        
        // output formatter 18 May 91
        return "Person{" + "name=" + name + ", gender=" + gender + ", birthYear=" + date + '}';
    }
    
}
