/**
 * Program that prints a string backward
 * 
 * 03-29-2021
 */

public class ch13_7
{
    public static void main(String[] args)
    {
        backwards("louise rafael");
    }

    // method to print the string temp backwards
    private static void backwards(String temp)
    {
        if (temp.length() != 1)
            backwards(temp.substring(1));
        
        System.out.print(temp.charAt(0));
    }
}