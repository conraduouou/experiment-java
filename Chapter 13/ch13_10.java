/**
 * Program that determines greatest common divisor using recursion
 * This implementation also defines the Euclidean algorithm
 * 
 * 03-29-2021
 */

public class ch13_10
{
    public static void main(String[] args)
    {
        System.out.println("The greatest common divisor of 4 and 38 is " + gcd(4, 38));
    }

    private static int gcd(int x, int y)
    {
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }
}