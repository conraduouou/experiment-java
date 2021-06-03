/**
 * Program that takes as input the first 25 positive integers
 * and returns their square root
 * 
 * 03-15-2021
 */
public class ch7_3
{   
    public static void main(String[] args)
    {
        int i = 1;
        for (i = 1; i <= 25; i++)
        {
            System.out.println(String.format("%d and %.2f", i, Math.sqrt((double) i)));
        }
    }
}
