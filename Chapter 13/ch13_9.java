/**
 * Program that implements exponential function through recursion
 * 
 * 03-29-2021
 */

public class ch13_9
{
    public static void main(String[] args)
    {
        System.out.println("The number 2 to the power of 5 is equal to " + power(2, 5));
    }

    // method that implements exponential function through recursion
    private static int power(int x, int y)
    {
        int total = 0;

        if (y == 0)
            return 1;
        else if (y == 1)
            return x;
        else
            return total += x * power(x, y - 1);
    }
}