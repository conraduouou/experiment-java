/**
 * Program that both determines if a number is prime and a palindrome
 * 
 * 03-15-2021
 */
import java.util.*;

public class ch7_13
{
    static Scanner console = new Scanner(System.in);

    // prime method to determine if passed number is prime
    public static boolean isPrime(int x)
    {
        if (x == 1 || x == 2)
            return true;
        else
        {
            for (int i = 2; i <= x / 2; i++)
            {
                if (x % i == 0)
                    return false;
            }

            return true;
        }
    }

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
        // test out methods
        System.out.println("both PRIME and PALINDROME?!?!?!");
        System.out.println("Enter number to check: ");

        int test = console.nextInt();

        if (isPrime(test))
            System.out.println("The number " + test + " is PRIME.");
        else
            System.out.println("The number " + test + " is NOT PRIME.");
        
        if (isPalindrome(test))
            System.out.println("The number " + test + " is a PALINDROME.");
        else
            System.out.println("The number " + test + " is NOT a PALINDROME.");
    }


}
