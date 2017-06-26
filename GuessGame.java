//Vilia Wang
//GuessGamei.java
//Purpose: This program plays a guessing game with the user. The user will 
//         be prompted to guess a random number. The user will be told if the
//         number is too high, too low, or correct. The user will be given 
//         the choice to repeat the game as many times as he/she wishes.  
  
import java.util.Scanner;                       //needed for Scanner class 
import java.util.Random;                        //needed for Random class 
  
public class GuessGame
{
   public static void main(String[] args)
   {
  
       //Constants
       final int GUESSMAX = 50;
       final int GUESSMIN = 1;
  
       //Variables
       int numGuess;
       String input;
       char answer;
       int target;
 
       Scanner kybd = new Scanner(System.in);         //create Scanner object
       Random rnd = new Random();                     //create Random object 
 
       //Welcome message to user 
       System.out.println("\nWelcome!\n\nCome test your luck at the Number" +
                          " Guess Game.\nPlease choose a number between " +
                          "1 and 50.\nI will give you hints along the way." +
                          "\n\nGood luck!");
 
       do
       {
          target = rnd.nextInt(50)+1;
          System.out.print("\nGuess a number, then hit 'Enter'.  ");
          numGuess = kybd.nextInt();
          kybd.nextLine();                            //consuming next line
 
          while (numGuess != target)
          {
             if ((numGuess > GUESSMAX) || (numGuess < GUESSMIN))
             {
                System.out.println("\nYour number is out of range." +
                                   "\nPlease choose an integer between " +
                                    GUESSMIN +
                                    " and " +
                                    GUESSMAX + ".");
                 System.out.print("Guess a number, then hit 'Enter'.  ");
                 numGuess = kybd.nextInt();
                 kybd.nextLine();
              }
              else if (numGuess > target)
              {
                 System.out.print("\nYour number is too high.");
                 System.out.print("\nGuess a number, then hit 'Enter'.  ");
                 numGuess = kybd.nextInt();
                 kybd.nextLine();
              }
              else
              {
                 System.out.print("\nYour number is too low.");
                 System.out.print("\nGuess a number, then hit 'Enter'.  ");
                 numGuess = kybd.nextInt();
                 kybd.nextLine();
              }
           }
 
           System.out.println("\n\nYOU GUESSED THE RANDOM NUMBER!\n\n");
           System.out.print("Would you like to play again?" +
                            "\nEnter 'Yes' to play" +
                            " again or 'No' to quit.  ");
  
           input = kybd.nextLine();
           answer = input.charAt(0);
           target = rnd.nextInt(50)+1;
  
     } while (answer == 'Y' || answer =='y');
  
     //Goodbye Statement
     System.out.println("\nThanks for playing the Number Guess Game!\n");
   }
}
