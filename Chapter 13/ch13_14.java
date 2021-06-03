/**
 * Program that converts decimal numbers into any base n numbers
 * using recursion
 * 
 * 03-29-2021
 */

public class ch13_14
{
    public static void main(String[] args)
    {
        System.out.println("The equivalent of 36 in base 2 is " + convertDecimal(36, 2));
    }

    private static int convertDecimal(int num, int base)
    {
        if (num < base)
            return num;
        else if (num % base == 0)
            return Integer.parseInt(convertDecimal(num / base, base) + "0");
        else
            return Integer.parseInt(convertDecimal(num / base, base) + String.format("%d", num % base));
    }
}