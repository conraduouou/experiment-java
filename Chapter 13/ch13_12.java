/**
 * Program that reverses order of int array index inputted in method
 * using recursion
 * 
 * 03-29-2021
 */

public class ch13_12
{
    public static void main(String[] args)
    {
        int[] array = {0, 1, 2, 3, 4, 5};

        System.out.println("before method: ");
        for (int i = 0; i < array.length; i++)
            System.out.println("Number " + (i + 1) + ": " + array[i]);
       
        reverse(array, 0, 5);
        System.out.println();
        System.out.println("after method: ");
        for (int i = 0; i < array.length; i++)
            System.out.println("Number " + (i + 1) + ": " + array[i]);
    }   

    // does not run when formal parameter high is less than formal parameter low
    private static void reverse(int[] array, int low, int high)
    {
        int temp;

        if (high > low)
        {
            temp = array[high];
            array[high] = array[low];
            array[low] = temp;

            reverse(array, low + 1, high - 1);
        }
    }
}