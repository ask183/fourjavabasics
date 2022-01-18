package dogGenetics;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
	
   public static void main(String[] args) {
	   //declare and initialize the scanner
       Scanner myScanner = new Scanner(System.in);
       //declare a String variable called name
       String name;
       //consult with user what is their dog's name
       System.out.print("What is your dog's name? ");
       //assign users input for dog's name to the name variable we declared in line 12
       name = myScanner.nextLine();
       
       System.out.println("Well then, I have this highly reliable report on "+name+"\'s prestigious background right here");
       //Creating random object using the Random class
       Random random = new Random();
       //declare array of integers with 5 elements
       int array[] = new int[5];
       //declare a integer variable called total and initialize it equal to 100.
       int total =100;
       //for loop iterates through each element in the array and assigns a random integer at each index which all should add up to be a total of 100.
       for(int i=0;i<array.length-1;i++){
           array[i] = random.nextInt(total);
           total -=array[i];
       }
       array[4] = total;
       //print statements for dog's DNA background report with the random numbers that were generated above.
       System.out.println("\n"+name+" is : ");
       System.out.println(array[0]+"% St. Bernard");
       System.out.println(array[1]+"% Chihuahua");
       System.out.println(array[2]+"% Dramatic RedNosed Asain Pug");
       System.out.println(array[3]+"% Common Cur");
       System.out.println(array[4]+"% King Doberman");
       
       System.out.println("\nWow, that's QUITE the dog!");
   }
}