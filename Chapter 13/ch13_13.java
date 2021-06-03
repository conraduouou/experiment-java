/**
 * Program that implements multiplication through repeated addition
 * through recursion
 * 
 * 03-29-2021
 */

public class ch13_13
{
    public static void main(String[] args)
    {
        System.out.println("The product of -4 and -10 is " + multiply(-4, -10));
    }    

    private static int multiply(int num1, int num2)
    {
        if (num1 < 0 && num2 < 0)
            return multiply(Math.abs(num1), Math.abs(num2));
        else if (num2 < 0 || num1 < 0)
            return -multiply(Math.abs(num1), Math.abs(num2));
        else if (num2 == 1)
            return num1;
        else
            return num1 + multiply(num1, num2 - 1);
    }
}
