/**
 * Program that demonstrates palindrome detection using a recursion
 * 
 * 03-29-2021
 */

public class ch13_6
{
    public static void main(String[] args)
    {
        if (isPalindrome("abba"))
            System.out.println("The string inputted is a palindrome.");
        else
            System.out.println("The string inputted is not a palindrome.");
    }

    private static boolean isPalindrome(String temp)
    {
        char c1 = Character.toLowerCase(temp.charAt(0));
        char c2 = Character.toLowerCase(temp.charAt(temp.length() - 1));

        if (temp.length() == 1)
            return true;
        else if (temp.length() == 2 && c1 == c2)
            return true;
        else if (c1 == c2)
            return isPalindrome(temp.substring(1, temp.length() - 1));
        else
            return false;
    }
}