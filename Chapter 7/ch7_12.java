/**
 * Program that determines if number is prime or not
 * 
 * 03-15-2021
 */
import java.util.*;

public class ch7_12
{
    static Scanner console = new Scanner(System.in);

    // prime method to determine if passed number is prime
    public static boolean isPrime(int x)
    {
        if (x == 1 || x == 2)
            return true;
        else if (x <= 0)
        {
            System.out.println("isPrime method: Negative number detected");
            return false;
        }
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

    public static void main(String[] args)
    {
        // test out method
        System.out.println("PRIME CHECKER!");
        System.out.print("Enter integer to check: ");

        int test = console.nextInt();

        if (isPrime(test))
            System.out.println("The number " + test + " is PRIME.");
        else
            System.out.println("The number " + test + " is NOT PRIME.");
    }
}
