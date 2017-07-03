//Vilia Wang 
//Functions.java 
//Purpose: The purpose of this program is to ask the user for an integer 
//         between 5-25. The integer will be used in a math problem, where
//         the result will be printed.  

import java.util.Scanner; 
public class Functions
{
   public static void main(String[] args)
   {
      int x;                                    //user's value input
      int answer;                               //answer to equation 
 
      Scanner kybd = new Scanner(System.in);
 
      welcome();                                //calls welcome method
      x = input();                              //calls input method
      answer = calculate(x);                    //calls calculate method
  
      System.out.print("Let's do some math with the number " + x + ".");
      System.out.print("\nLet x = " + x + " in the following equation:");
      System.out.print("(x*2)-(x+25)");
      System.out.print("\n(" + x + "*2)-(" + x + "+25) = " + answer);
      System.out.print("\nThe answer is: " + answer);
      
      goodbye();                                //calls goodbye method 
   }
 
   /**
      The welcome method prints a welcome message.
   */
  
   public static void welcome()
   {
      System.out.println("\nWelcome to the Functions program!");
   }
 
   /**
       The input method requests a vaule from user between 5-25 and returns
       only a valid int value to main.
       @return the user's input as int 
   */
  
    public static int input()
    {
       //constants 
       final int RANGEMIN = 5;                   //minimum value 
       final int RANGEMAX = 25;                  //maximum value 
 
       int input;                                //user's integer input 
 
       System.out.print("\nChoose a number between ");
       System.out.print(RANGEMIN);
       System.out.print(" and ");
       System.out.print(RANGEMAX);
       System.out.print(".\nThen hit 'Enter'.   ");
 
       Scanner kybd = new Scanner(System.in);
       input = kybd.nextInt();                   //getting user's integer input
 
       while (input < RANGEMIN || input > RANGEMAX)
       {
          System.out.print("\nOops!\nYou must choose an integer between " +
                           RANGEMIN + " and " + RANGEMAX + ".\n" +
                           "\nTry a different number, then hit 'Enter'.  ");
 
          input = kybd.nextInt();                //getting input again
       }
 
       System.out.println("\nYou chose the number: " + input +"\n");
       return input;
    }
  
    /**
       The calculate function takes a number and  tests it in a math expression. 
       @param x The user's integer input 
       @return The answer to (x*2)-(X+25) as an int 
    */
 
    public static int calculate(int x)
    {
       int answer;                            //answer to equation 
 
       answer  = (x*2)-(x+25);
       return answer;
    }
 
    /**
       The goodbye function prints a goodbye message.
    */
 
    public static void goodbye()
    {
       System.out.println("\n\nThanks for visiting the Functions program.");
       System.out.println("\nGoodbye!\n");
    }
}
