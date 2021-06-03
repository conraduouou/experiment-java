/**
 * Program that finds the last occurrence of largest index in an array
 * 
 * 03-21-2021
 */

public class ch9_3
{
    public static void lastLargestIndex(int[] list)
    {
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < list.length; i++)
        {
            if (list[i] >= max)
            {
                max = list[i];
                maxIndex = i;
            }
        }

        System.out.println("The smallest number in the array is " + max + " and the index is " + maxIndex);
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

        array[7] = 35;
        
        lastLargestIndex(array);
    }
}
