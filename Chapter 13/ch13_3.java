/**
 * Program that demonstrates recusion for counting vowels in a string
 * 
 * 03-29-2021
 */
import java.util.*;

public class ch13_3
{
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        System.out.println("Please enter a string to count vowels from: ");

        String temp = console.next();

        int num = vowelCount(temp, 0);

        System.out.println("The result is " + num);
    }

    // method to count vowels in a string starting from index num
    private static int vowelCount(String temp, int num)
    {
        int total = 0;      // variable to count vowels
        int count = temp.length();
        
        if (num >= count)
            return 0;
        else if (num < 0)
            return 0;
        else
        {
            switch (Character.toLowerCase(temp.charAt(num)))
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    total += 1 + vowelCount(temp, num + 1);
                    break;
                default:
                    total += vowelCount(temp, num + 1);
            }
        }

        return total;
    }
}
