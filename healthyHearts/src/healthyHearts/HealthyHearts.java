package healthyHearts;

import java.util.Scanner;   // To take input from user

//Define class named as Calculator
public class HealthyHearts {
 
 // main method
 public static void main(String[] args) {
     // Integer variable to hold age of user    
     int ageOfUser;    
     // Integer variable to hold maximum heart rate
     int maxHeartRate;    
     //declare and initialize the scanner
     Scanner myScanner = new Scanner(System.in);
     // Take the age input from user
     System.out.print("What is your age? ");
     // Assign the age input we receive from the user to the variable we declared on line 11.
     ageOfUser = myScanner.nextInt();
     // Find maximum heart rate
     maxHeartRate = 220 - ageOfUser;
     // Print the maximum heart rate
     System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
     // Print the target HR Zone as 50 - 85% of the maximum heart rate 
     System.out.println("Your target HR Zone is " + (int)Math.ceil(0.5*maxHeartRate) + " - " + (int)Math.ceil(0.85 * maxHeartRate) + " beats per minute");
 }
}

