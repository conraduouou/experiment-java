/**
 * Program that finds out how many dice rolls a specific number takes
 * 
 * 03-15-2021
 */
import java.util.*;

public class ch7_7
{
    static Scanner console = new Scanner(System.in);

    // method that 'rolls dice'
    public static int rollDice(int num)
    {
        int die1;
        int die2;
        int sum;
        int rollCount = 0;

        do
        {
            die1 = (int) (Math.random() * 6) + 1;
            die2 = (int) (Math.random() * 6) + 1;
            sum = die1 + die2;
            rollCount++;
        }
        while (sum != num);

        return rollCount;
    }

    public static void main(String[] args)
    {
        int test;
        char ch;

        // test out method
        System.out.println("DICE ROLLER!");
        
        // prompt
        do
        {
            System.out.print("Enter number to find for dice (min 1, max 12): ");
            test = Integer.parseInt(console.next());

            if (test < 1 || test > 12)
                System.out.println("Invalid output");
            else
                System.out.println("The number of rolls it takes to get " + test + " is " + rollDice(test));
            
            System.out.println("Would you like to try again? (Y/N)");
            ch = console.next().charAt(0);
        }
        while (Character.toLowerCase(ch) == 'y');
    }
}
