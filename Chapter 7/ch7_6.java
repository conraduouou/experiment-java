/**
 * Program that reverses digits input by user
 * 
 * 03-15-2021
 */
import java.util.*;

public class ch7_6
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

    public static void main(String[] args)
    {
        // test out method
        int test;

        System.out.println("DIGIT REVERSE?!?!?!");
        System.out.print("Enter number to reverse: ");

        test = Integer.parseInt(console.next());

        System.out.println("The reverse is " + reverseDigit(test));
    }
}
