/**
 * Program
 */
import java.util.*;

public class ch7_11
{
    static Scanner console = new Scanner(System.in);

    // reverse method
    public static int reverseDigit(int x)
    {
        int toReturn = 0;
        while (x != 0)
        {
            // adds value through remainder and division, essentially 'flipping' values
            if (toReturn == 0)
                toReturn += x % 10;
            else
                toReturn = (toReturn * 10) + (x % 10);

            x /= 10;
        }

        return toReturn;
    }

    // palindrome check for int
    public static boolean isPalindrome(int num)
    {
        if (num == reverseDigit(num))
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        // test out method
        int test;

        System.out.println("PALINDROME?!?! (integer version)");
        System.out.print("Enter number to check: ");

        test = Integer.parseInt(console.next());

        System.out.println("The reverse is " + reverseDigit(test));

        if (isPalindrome(test))
            System.out.println("The number " + test + " is a PALINDROME");
        else
            System.out.println("The number " + test + " is NOT a PALINDROME");
    }
}
