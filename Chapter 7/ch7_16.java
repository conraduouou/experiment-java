/**
 * Program that reads a file that consists of name formatted as:
 * LAST, FIRST MIDDLE
 * 
 * then returns a name formatted as:
 * FIRST MIDDLE LAST
 * 
 * 03-15-2021
 */
import java.util.*;
import java.io.*;

public class ch7_16
{
    // method to use to alter formatted name
    public static String nameAlter(String str)
    {
        // this line of code just says make a substring out from the 0th character
        // up to the occurrence of ','
        String last = str.substring(0, str.indexOf(','));

        // this line of code says to make a substring out of the first occurrence of a space and a character after that,
        // up to the occurrence of yet another space, but starting from the first space so that the first would not be read
        String first = str.substring(str.indexOf(' ') + 1, str.indexOf(' ', str.indexOf(' ') + 1));

        // this line of code then saus to make substring out of the first occurrence of the first name plus the length of
        // that up to the end of the string, and there's also me adding a little space there for readability in the final product.
        String middle = str.substring(str.indexOf(first) + first.length()).concat(" ");

        // this is then another line of code that combines all the substrings got
        str = first.concat(middle.concat(last));

        return str;
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        // test out method
        Scanner inFile = new Scanner(new FileReader("names.txt"));
        
        System.out.println("ALTER THOSE NAMES!!!!!!");
        System.out.println();

        String test;

        while (true)
        {
            if (inFile.hasNextLine())
            {
                test = inFile.nextLine();
                System.out.println(test);
                System.out.println(nameAlter(test));
                System.out.println();
            }
            else
                break;

        }

        inFile.close();
    }
    
}
