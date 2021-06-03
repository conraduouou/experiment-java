/**
 * Program that reads a string and then outputs the string in uppercase letters
 * 
 * 03-21-2021
 */
import java.util.*;

public class ch9_5
{
    // instantiate Scanner object
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        // make char array to store character string
        char[] test = new char[50];

        System.out.println("CAPITALIZER?!?!?!1");
        System.out.print("Input a string: ");
        
        String temp = console.next();
        
        // store got string from user input to char array
        for (int i = 0; i < temp.length(); i++)
            test[i] = temp.charAt(i);

        // capitalize each lower-cased letter
        for (int i = 0; i < temp.length(); i++)
        {
            if (!Character.isUpperCase(test[i]))
                test[i] = Character.toUpperCase(test[i]);
        }

        System.out.println(test);
    }
}
