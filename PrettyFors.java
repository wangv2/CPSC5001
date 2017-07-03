//Vilia Wang
//PrettyFors.java
//Purpose: The purpose of this project is to practice for and nested
//         for statements to create pretty patterns. The program will
//         request an integer from the user to create the patterns. 
 
import java.util.Scanner;           //needed for Scanner class  
 
public class PrettyFors
{
   public static void main(String[] args)
   {
      int x;                        //user's input 
 
      Scanner kybd = new Scanner(System.in);    //creating a Scanner object

      System.out.print("\nWelcome to the Pretty Fors program!\n");
      System.out.print("\nI will display 5 patterns based\non a positive");
      System.out.print(" integer of your choice.\n\nPlease choose a ");
      System.out.print("positive integer,\nthen hit 'Enter'.  ");
      x = kybd.nextInt();                       //holds user input

      //input validation 
      while (x <= 0)
      {
         System.out.println("\nOops! You must pick a positive integer.");
         System.out.print("Try again.  ");
         x = kybd.nextInt();
      }
  
      System.out.println("\nYou chose the number: " + x + "\n");
 
      //pattern 1
      System.out.println("Pattern 1");
      for (int count = 1; count <= x; count++)
         System.out.print(x);

      System.out.println();
      System.out.println();
 
      //pattern 2 
      System.out.println("Pattern 2");
      for (int count = 1; count <= x; count++)
         System.out.println("1");
      
      System.out.println();
 
      //pattern 3
      System.out.println("Pattern 3");
      System.out.print(" ");                    //space in left corner
      for (int count = 1; count <= x; count++)  //first row 
         System.out.printf("%3d", count);
         System.out.println();
 
      for (int multi = 1; multi <=x; multi++)
      {
         System.out.print(multi);
 
         for (int row = 1; row <= x; row++)
            System.out.printf("%3d", multi*row);
            System.out.println();
      }
 
      //pattern 4
      System.out.print("\n\nPattern 4");
         for (int num = 1; num <= x; num++)
         {
            System.out.println();
            for (int times = 1; times <= num; times++)
               System.out.printf("%-2d",num);
         }
  
      System.out.println();
      System.out.println();
  
      //pattern 5
      System.out.println("Pattern 5");
      for (int i=1; i <= x; i++)
      {
         for (int space = 1; space <= i; space++)
            {
               System.out.print(" ");
            }
 
         System.out.println(i);
      }
 
       for (int i = x; i > 1; i--)
       {
          for (int back = x; back > 1; back--)
          {
             System.out.print(" ");
          }
  
             System.out.println(x-1);
             x--;
          }
 
       System.out.println();
       System.out.println();
}
                                                                  
