/**
 * Program that tests out palindrome
 * 
 * 03-15-2021
 */
import java.util.*;

public class ch7_8
{
    static Scanner console = new Scanner(System.in);

    // method that checks palindrome
    public static boolean isPalindrome(String str)
    {
        int len = str.length();
        int i, j;

        j = len - 1;

        for (i = 0; i <= (len - 1); i++)
        {
            if (str.charAt(i) != str.charAt(j))
                return false;

            j--;
        }

        return true;
    }

    public static void main(String[] args)
    {
        String test;

        // test out method
        System.out.println("PALINDROME?!?!?1");
        System.out.print("Enter string of characters to check: ");

        test = console.next();

        if (isPalindrome(test))
            System.out.println("The string '" + test + "' is a PALINDROME.");
        else
            System.out.println("The string '" + test + "' is NOT a PALINDROME.");
    }
}
