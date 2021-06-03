/**
 * Program that first prints out first 100 positive emirps
 * and then asks the user to type in a number, of which my program
 * is going to determine if it is an emirp as well.
 * 
 * 03-15-2021
 */
import java.util.*;

public class ch7_14
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

    public static void main(String[] args)
    {
        // print out first 100 emirps
        int counter = 1, i = 1;
        while (counter != 101)
        {
            if (isPrime(i) && isPrime(reverseDigit(i)))
            {
                System.out.println(counter + ": " + i + ", " + reverseDigit(i));
                counter++;
            }

            i++;
        }

        // test out method
        System.out.println();
        System.out.println();
        System.out.println("IS IT A PRIME AND AN EMIRP?!?!");
        System.out.print("Enter a number to check: ");

        int test = console.nextInt();

        if (isPrime(test) && isPrime(reverseDigit(test)))
            System.out.println("The number " + test + " is an EMIRP.");
        else
            System.out.println("The number " + test + " is NOT an EMIRP.");
    }
}