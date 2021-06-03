/**
 * Program that converts binary to decimal using recursion
 * 
 * 03-29-2021
 */

public class ch13_15
{
    public static void main(String[] args)
    {
        System.out.println("The value of 11111111 in decimal is " + convertBinary(11111111));
    }

    private static int convertBinary(int num)
    {
        String temp = "" + num;

        if (temp.length() != 1)
        {
            if (temp.charAt(0) == '1')
                return (int)(Math.pow(2, temp.length() - 1)) + convertBinary(Integer.parseInt(temp.substring(1)));
            else
                return convertBinary(Integer.parseInt(temp.substring(1)));
        }
        else
            return num;
    }
}