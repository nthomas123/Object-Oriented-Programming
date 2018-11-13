
package lab2_loopingthrutime;

import java.util.Scanner;

/*
Noble Thomas
Lab 2: Looping Thru Time
CMPSCI 221
02/14/2018
 */
public class Lab2_LoopingThruTime {
    public static void main(String [] args) {
     Scanner scnr = new Scanner(System.in);
        int inputHours;
        int inputMins;
        int inputSecs;
        int HOURS = 24;
        int MINUTES = 60;
        int SECONDS = 60;
        int counter = 0 ;
     //Gets hours input from user
     System.out.print("Please enter a hour of the day: ");
     inputHours = scnr.nextInt();
    
     //Validate hour input
     while((inputHours < 0) || (inputHours > HOURS))  { 
      System.out.print("Please enter a valid hour of the day: ");
      inputHours = scnr.nextInt();
     }
     
     //Gets minutes input from user
     System.out.print("Please enter any minute from a hour: ");
     inputMins = scnr.nextInt();
     
     // Validate minute Input
     while((inputMins < 0) || (inputMins > MINUTES))  { 
      System.out.print("Please enter a valid value for minutes: ");
      inputMins = scnr.nextInt();
     }
     
     //Gets seconds input from user
     System.out.print("Please enter any value for seconds: ");
     inputSecs = scnr.nextInt();
     
     // Validate minute Input
     while((inputSecs < 0) || (inputSecs > SECONDS))  { 
      System.out.print("Please enter a valid value for seconds: ");
      inputSecs = scnr.nextInt();
     }
     //Nested loop to count time
     while (inputHours < HOURS){
         while (inputMins < MINUTES){
            while (inputSecs < SECONDS){
             //Prints the values of the Hours, minutes, and seconds
             System.out.println("#" + counter + "[" + inputHours + ":" + inputMins + ":" + inputSecs + "]");
            //Counter
             counter = counter + 1 ;
            //Adds +1 seconds
             inputSecs= inputSecs+1;
            }
            //Adds +1 Minutes and Sets seconds to 0 after each loop
             inputMins= inputMins+1;
             inputSecs=0;
         }
         //Adds +1 Hours and Sets minutes to 0 after each loop
         inputHours = inputHours + 1;
         inputMins=0;
     }
    }
}
