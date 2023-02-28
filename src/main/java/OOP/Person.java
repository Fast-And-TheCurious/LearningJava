
package OOP;

import javax.swing.JOptionPane;

public class Person {
    
    private int id;
    private String name;
    private String surname;
    private double weight;
    private double height;    
      
    public Person(int inID, String inName, String inSurname, double inWeight, double inHeight){
        
        id = inID;
        name = inName;
        surname =inSurname;
        weight=inWeight;
        height =inHeight;       

    }  
    public int getID(){
        return id;
    }    
    public String getName(){
        return name;
    }
    public String getSurname (){
        return surname;
    }
    public double getWeight(){
        return weight;
    }
    
    public double getBMI(){
        double bmi= weight/(Math.pow(height,2));
    return bmi;
    }
    
    public String toString(){
        return id + " " + name + " " + surname;
    }
    public double getHeight(){       
        return height;
    }   
    public String getGmail(){
        String email=name+"."+surname+"@gmail.com";
        return email;
    }
    public void setID(){
        int inID=Integer.parseInt(JOptionPane.showInputDialog("Enter your ID"));
        id = inID;
    }
    public void setName(){
        String inName= JOptionPane.showInputDialog("Enter your name.");
        name=inName;
    }
    public void setSurname(){
       String inSurname= JOptionPane.showInputDialog("Enter your surname.");
        surname=inSurname;
    }
    public void setWeight(){
        double inWeight=Double.parseDouble(JOptionPane.showInputDialog("Enter your weight."));
        weight=inWeight;
    }
    public void setHight(){
        double inHeight=Double.parseDouble(JOptionPane.showInputDialog("Enter your height."));
        height=inHeight;
    }    
}
