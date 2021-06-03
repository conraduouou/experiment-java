/**
 * Program that counts number of vowels
 * 
 * 03-15-2021
 */
import java.util.*;

public class ch7_2
{
    static Scanner console = new Scanner(System.in);

    // method to return true or false if character is vowel
    public static boolean isVowel(char ch)
    {
        switch (ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args)
    {
        // count vowels
        int counter = 0;

        // get string from user
        System.out.println("Vowel Counter!");
        System.out.println();
        System.out.print("Input a string to count vowels from: ");

        String test = console.nextLine();
        
        for (int i = 0; i < test.length(); i++)
        {
            if (isVowel(test.charAt(i)))
                counter++;
        }

        System.out.println("The number of vowels is " + counter);
    }
}
