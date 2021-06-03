/**
 * Program that demonstrates recursion through printing of asterisks
 * 
 * 03-28-2021
 */
import java.util.*;

public class ch13_1
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        printAsterisk(4, 4);
    }

    // must be same number
    private static void printAsterisk(int num1, int num2)
    {
        if (num1 == 0)
            num1--;
        
        if (Math.abs(num1 - 1) <= num2)
            printAsterisk(num1 - 1, num2);
        
        for (int i = 0; i < Math.abs(num1); i++)
            System.out.print("*");

        System.out.println();    
    }
}