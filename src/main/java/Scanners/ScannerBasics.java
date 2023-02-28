
package Scanners;

import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ScannerBasics {
    public static void main(String[] args) {
    String input =JOptionPane.showInputDialog("Enter your name,ID number,height and if you smoke with true or false");
    Scanner sc=new Scanner(input).useLocale(Locale.UK);
    
    String name=sc.next();
    int iD=sc.nextInt();
    double height=sc.nextDouble();
    boolean smoke=sc.nextBoolean();
    System.out.println("Name: "+name+"\n"+"ID number: "+iD+"\n"+"Height: "+height+"\n"+"Smoke: "+smoke);
        
    }
   
}
