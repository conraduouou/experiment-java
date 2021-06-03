/**
 * Program that returns an integer in reverse using a recursive method
 * 
 * 03-29-2021 (NOT DONE)
 */

public class ch13_8
{
    public static void main(String[] args)
    {
        System.out.println(backwardsInt(37124));
    }

    // method to reverse an integer and return via recusion
    private static int backwardsInt(int temp)
    {
        if (temp < 10)
            return temp;
        else
            return Integer.parseInt(String.format("%d", temp % 10) + backwardsInt(temp / 10));
    }
}