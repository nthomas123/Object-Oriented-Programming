/*
Noble Thomas
03/25/2018
CMPSCI 221
Lab5_CarUsage
*/
package lab5_carusage;
import java.util.Scanner;


public class Lab5_CarUsage {
    //Private Class for Internal Fields
    private double TotalMiles;
    private double TotalGallons;
    private double MPG;
    final static int EXIT_VALUE=-1;

    
    //Defaut constructor that will initialize these private field variables to 0
    public Lab5_CarUsage()
    {
        TotalMiles = 0;
        TotalGallons = 0;
        MPG = 0;
    }
    //Public class method that adds TotalGallons
    public double AddGas (int gallonsBought, double pricePaid)
    {
        return TotalGallons = gallonsBought + TotalGallons;
    }
    
    //Public class method that adds miles
    public double AddMiles(int milesDriven){
        return TotalMiles= milesDriven + TotalMiles ;
    }
    
    //Public class method that calculates MPG
    public double Calculation ()
    {
        return MPG =  (TotalMiles / TotalGallons) ;
    }  

    //Public  Main
    public static void main(String[] args) 
    {
       Lab5_CarUsage myCar = new Lab5_CarUsage();
       Scanner scnr = new Scanner(System.in);
       
       //Vairables
       int gallonsBought;
       double pricePaid = 2.50;
       int milesDriven ;
       int gasStops =0 ;
       int temp; 
       
       //Loop That excutes the code
       do{ 
           //Loop that determines if user input driving distance is valid
           do{ 
               System.out.print ("Enter a valid driving distance: ");
               milesDriven = scnr.nextInt();
           }while(milesDriven < 0);
           
         gasStops++;
           //Loop that determines if user input Gass is valid
           do{ 
               
               System.out.print (  "For gas stop " + gasStops +  ", how much gas did you put in your car? :");
               gallonsBought = scnr.nextInt();
           }while(gallonsBought < 0);
           
           //Adds Miles to public variable
           myCar.AddMiles(milesDriven);
           //Adds Gas to public variable
           myCar.AddGas(gallonsBought, pricePaid);
           //Prints out MPG
           System.out.println("Total MPG = " + myCar.Calculation());
           System.out.print ("To Exit Enter -1, To Continue Enter any Value");
           temp = scnr.nextInt();
       }while(temp != -1);
       
 
    }
    
}
