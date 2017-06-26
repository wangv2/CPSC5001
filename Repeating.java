//Vilia Wang
//Repeating.java
import java.util.Scanner;     //Needed for Scanner class
  
public class Repeating
{
   public static void main(String[] args)
      {
         //Welcome message 
         System.out.println("\nWelcome!\n\nFor this game, you will enter two" +
                           " integers. \nYour goal is for the first integer " +
                           "to be\na multiple of the second integer.\nIf you" +
                           " succeed, you will be told its factor." +
                           "\nIf the first is not a multipe of the second or" +
                           "\nif you enter a zero, you will be notified, and" +
                           "\nasked if you would like to play again. Enjoy!");
  
        int integer1;           //holds user's first integer
        int integer2;           //holds user's second integer
        String input;           //holds 'yes' or 'no'
        char repeat;            //asking user if they want to replay  
  
        //Create a Scanner object to read input
        Scanner keyboard = new Scanner(System.in);
  
        do
        {
  
           //Getting integer1 from user
           System.out.print("\nType an integer, then press 'Enter'.  ");
           integer1 = keyboard.nextInt();
  
           //Getting integer2 from user
           System.out.print("\nType another integer, then press 'Enter'.  ");
           integer2 = keyboard.nextInt();
  
           //input validation checking for zero
           if ((integer1 ==0) || (integer2==0))
              System.out.println("\nSorry, you cannot divide by zero.");
  
           //Determining if modulus is equal to zero
           else if(integer1 % integer2 == 0)
           {
              System.out.print("\nGiven the first integer ");
              System.out.print(integer1);
              System.out.print(" and the second\ninteger ");
              System.out.print(integer2);
              System.out.print(", you have a factor of ");
              System.out.print(integer1/integer2 + ".");
           }
           //Final else statement for when modulus does not equal zero 
           else
              System.out.println("\nYour first integer is" +
                                 " not a multiple of your" +
                                 " second integer.");
  
           System.out.print("\n\nWould you like to play again?" +
                            "\n\nEnter 'Yes' to play" +
                            "  again, or 'No' to end game.  ");
           keyboard.nextLine();             //consuming the next line 
           input = keyboard.nextLine();     //user answers question
           repeat = input.charAt(0);        //get the first char
  
        }while (repeat == 'Y' || repeat =='y');
  
        //Goodbye Statement  
        System.out.print("\nThanks for playing!\n\n");
    }
 }
