/**
 * Program that finds the smallest index in a given int array
 * 
 * 03-21-2021
 */
import java.util.Scanner;

public class ch9_2
{
    public static Scanner console = new Scanner(System.in);

    public static void smallestIndex(int[] list)
    {
        int min = 999;
        int minIndex = 0;

        for (int i = 0; i < list.length; i++)
        {
            if (list[i] < min)
            {
                min = list[i];
                minIndex = i;
            }
        }

        System.out.println("The smallest number in the array is " + min + " and the index is " + minIndex);
    } 

    public static void main(String[] args)
    {
        int[] array = new int[10];

        array[0] = 1;
        array[1] = 1;
        array[2] = 35;

        for (int i = 3; i < array.length; i++)
        {
            array[i] = 1;
        }
        
        smallestIndex(array);
    }
}
