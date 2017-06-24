//Vilia Wang
//MadLibs.java 
  
import java.util.Scanner;  //needed for the Scanner class 
   
public class MadLibs
{
   public static void main(String[] args)
   {
        String name;      //to hold user's name
        String place;     //to hold place of residence 
        int  age;      //to hold age
        String college;      //to hold college name
        String profession;   //to hold work place name 
        String animal;       //to hold type of pet
        String petname;      //to hold name of pet 
  
        //Briefly explains program to user
        System.out.print("\nWelcome to Mad Libs! Please answer each of the 7");
        System.out.print(" questions. \nHit enter after each response. Enjoy!\n");
  
        //Creating a Scanner object to read input 
        Scanner keyboard = new Scanner(System.in);
 
        //Getting user's name 
        System.out.print("\nWhat is your name? ");
        name = keyboard.nextLine();
  
        //Getting user's residence 
        System.out.print("Where do you live? ");
        place = keyboard.nextLine();
 
        //Getting user's age
        System.out.print("what is your age? ");
        age = keyboard.nextInt();
  
        //Consuming the remaining newline
        keyboard.nextLine();
  
        //Getting user's college name 
        System.out.print("Where did you go to college? ");
        college = keyboard.nextLine();
  
        //Getting user's profession
        System.out.print("What is your job? ");
        profession = keyboard.nextLine();
  
        //Getting user's pet type 
        System.out.print("What kind of pet do you have? ");
        animal = keyboard.nextLine();
  
        //Getting user's pet name 
        System.out.print("What is the name of your pet? ");
        petname = keyboard.nextLine();
  
       System.out.print("\nThere once was a person named " + name);
       System.out.print(" who lived in " + place + ".\nAt the age of ");
       System.out.print(age + ", " + name + " went to college at ");
       System.out.print(college + ".\n" + name);
        System.out.print(" graudated and went to work as a " + profession);
       System.out.print(".\nThen, " + name + " adopted a " + animal);
       System.out.println(" named " + petname + ".");
        System.out.println("They both lived happily ever after!");
        System.out.print("\nThanks for playing Mad Libs. Have a great day!");
    }
 }
