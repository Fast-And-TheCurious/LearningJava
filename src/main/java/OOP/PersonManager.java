
package OOP;

import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class PersonManager {
    public static String getEmail(int id){
        
        //open text file into scanner
        //loop
        for (int i = 0; i < 4; i++) {
            //get one line of text file from scanner
            String line = JOptionPane.showInputDialog("Enter person");
            
            Scanner lineSc = new Scanner(line).useDelimiter("#").useLocale(Locale.UK);
            int lineId = lineSc.nextInt();
            String lineName = lineSc.next();
            String lineSurname = lineSc.next();
            double lineWeight = lineSc.nextDouble();
            double lineHeight = lineSc.nextDouble();
            
            Person p = new Person(lineId, lineName, lineSurname, lineWeight, lineHeight);
            
            System.out.println("");
            
            if(p.getID()==id){
                return p.getGmail();
            }            
        }        
        return null;
    }    
     public static String getName(int id){
        
        for (int i = 0; i < 4; i++) {
           
            String line = JOptionPane.showInputDialog("Enter person");
            
            Scanner lineSc = new Scanner(line).useDelimiter("#").useLocale(Locale.UK);
            int lineId = lineSc.nextInt();
            String lineName = lineSc.next();
            String lineSurname = lineSc.next();
            double lineWeight = lineSc.nextDouble();
            double lineHeight = lineSc.nextDouble();
            
            Person p = new Person(lineId, lineName, lineSurname, lineWeight, lineHeight);
            
            if(p.getID()==id){
                return p.getName();               
            }                   
        }        
        return null;
    }
     
     public static double getAvgHeight(){
         int count=0;
         double totalH=0;
         double avHeight = 0;
        for (int i = 0; i < 4; i++) {
            
            String line = JOptionPane.showInputDialog("Enter person");
            
            Scanner lineSc = new Scanner(line).useDelimiter("#").useLocale(Locale.UK);
            int lineId = lineSc.nextInt();
            String lineName = lineSc.next();
            String lineSurname = lineSc.next();
            double lineWeight = lineSc.nextDouble();
            double lineHeight = lineSc.nextDouble();
            count++;
                        
            totalH+=lineHeight;            
            avHeight=totalH/count;
        }        
        return avHeight;
    }
      public static double getAvgWeight(){
         int count=0;
         double totalW=0;
        double avWeight = 0;
        for (int i = 0; i < 4; i++) {
            
            String line = JOptionPane.showInputDialog("Enter person");
            
            Scanner lineSc = new Scanner(line).useDelimiter("#").useLocale(Locale.UK);
            int lineId = lineSc.nextInt();
            String lineName = lineSc.next();
            String lineSurname = lineSc.next();
            double lineWeight = lineSc.nextDouble();
            double lineHeight = lineSc.nextDouble();
            count++;
                        
            totalW+=lineWeight;            
             avWeight =totalW/count;
        }        
        return avWeight;
    }
      public static double getAvgBMI(){
         int count=0;
         double totalBMI=0;
        double avBMI = 0;
        for (int i = 0; i < 4; i++) {
            
            String line = JOptionPane.showInputDialog("Enter person");
            
            Scanner lineSc = new Scanner(line).useDelimiter("#").useLocale(Locale.UK);
            int lineId = lineSc.nextInt();
            String lineName = lineSc.next();
            String lineSurname = lineSc.next();
            double lineWeight = lineSc.nextDouble();
            double lineHeight = lineSc.nextDouble();
            count++;
                        
            totalBMI+=lineWeight;            
             avBMI =totalBMI/count;
        }        
        return avBMI;
    }
}
