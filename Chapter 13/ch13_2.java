/**
 * Program that prints Christmas tree-like asterisk in order
 * 
 * 03-28-2021
 */

public class ch13_2
{
    public static void main(String[] args)
    {
        printStars(10, 1);
    }

    // method to do recursion
    private static void printStars(int num1, int num2)
    {
        if (num2 == 2 * num1)
            return;
        else if (num2 < num1)
        {
            int spaces = num1 - num2;
            int stars = num2;

            for (int i = 0; i < spaces; i++)
                System.out.print(" ");
            
            for (int i = 0; i < stars; i++)
                System.out.print("* ");
            
            System.out.println();
        
            printStars(num1, num2 + 1);
        }
        else if (num2 >= num1)
        {
            int spaces = num2 - num1;
            int stars = num1 - spaces;

            for (int i = 0; i < spaces; i++)
                System.out.print(" ");
            
            for (int i = 0; i < stars; i++)
                System.out.print("* ");
            
            System.out.println();
        
            printStars(num1, num2 + 1);
        }
    }
}
