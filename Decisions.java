//Vilia Wang
//Decisions.java
import java.util.Scanner;     //Needed for Scanner class

public class Decisions
{
      public static void main(String[] args)
      {
      //Welcome message 
     System.out.println("\nWelcome!\n\nFor this game, you will enter two" +
             " integers. \nYour goal is for the first integer " +
              "to be a multiple of the second integer.\nIf you" +
             " succeed, you will be told its factor." +
              "\nIf the first is not a multipe of the second, you" +
             " will be notified, and asked to try again.");
 
    int integer1;        //holds user's first integer
    int integer2;        //holds user's second integer
  
    //Create a Scanner object to read input
    Scanner keyboard = new Scanner(System.in);
 
     //Getting integer1 from user
     System.out.print("Type an integer, then press 'Enter'.  ");
     integer1 = keyboard.nextInt();
  
    //Getting integer2 from user
    System.out.print("Type another integer, then press 'Enter'.  ");
    integer2 = keyboard.nextInt();

     //Determining if either integer is zero
    if (integer2==0)
       System.out.println("\nSorry, you cannot divide by zero. Please restart" +
          " the program to try different number.\n");
 
    //Determining if modulus is equal to zero
    else if(integer1 % integer2 == 0)
        System.out.println("\nGiven the first integer " + integer1 + " and the " +
           "second integer " + integer2 + ", you have a factor" +
          " of " + integer1/integer2 + ".\n\nThanks for playing!\n");
  
     //Final else statement for when modulus does not equal zero 
     else
        System.out.println("\nYour first integer is not a multiple of your" +
           " second integer. Please restart the program to" +
           " try different numbers.\n");
    }
}
