package edu.carrollcc.cis232;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("What is your name?");
    	String username = keyboard.nextLine();
        System.out.println("Hello " + username + "!");
        keyboard.close();
    }
}
