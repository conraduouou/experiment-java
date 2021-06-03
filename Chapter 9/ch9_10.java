/**
 * Program that can add any n-digit integers, even when it exceeds the counter
 * through an array
 * 
 * 03-21-2021
 */
import java.util.*;

public class ch9_10
{
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] array1, array2;
        String temp;

        System.out.println("ADD-INATOR?!?!?!?1");

        // prompt
        System.out.println("Input a number: ");
        temp = console.next();

        // set array1 size according to temp
        array1 = new int[temp.length()];

        // set last digit of string temp as first index of array1
        for (int i = temp.length() - 1; i >= 0; i--)
        {
            array1[(temp.length() - 1) - i] = temp.charAt(i) - 48; 
        }

        // prompt second number
        System.out.println("Input another number: ");
        temp = console.next();
        
        // set array2 size according to new temp
        array2 = new int[temp.length()];

        // repeat process in setting array1 values
        for (int i = temp.length() - 1; i >= 0; i--)
        {
            array2[(temp.length() - 1) - i] = temp.charAt(i) - 48; 
        }

        System.out.println("The sum is: ");
        calculateSum(array1, array2);
    }

    // calculate sum of array and print
    public static void calculateSum(int[] list1, int[] list2)
    {
        int[] sum;
        // two conditional statements in order for sum array to be initialized accordingly
        if (list1.length > list2.length)
        {
            sum = new int[list1.length + 1];

            for (int i = 0; i < list1.length; i++)
            {
                if (i < list2.length)
                    sum[i] = list1[i] + list2[i];
                else
                    sum[i] = list1[i];

                // carry 1 to left of current digit, that is, the next index
                if (sum[i] >= 10)
                {
                    sum[i + 1]++;
                    sum[i] -= 10;
                }
            }
        }
        else
        {
            sum = new int[list2.length + 1];

            for (int i = 0; i < list2.length; i++)
            {
                if (i < list1.length)
                    sum[i] = list1[i] + list2[i];
                else
                    sum[i] = list2[i];

                // carry 1 to left of current digit, that is, the next index
                if (sum[i] >= 10)
                {
                    sum[i + 1]++;
                    sum[i] -= 10;
                }
            }
        }

        // print contents of array
        if (sum[sum.length - 1] == 0)
        {
            for (int i = sum.length - 2; i >= 0; i--)
            {
                System.out.print(sum[i]);
            }
        }
        else
        {
            for (int i = sum.length - 2; i >= 0; i--)
            {
                System.out.print(sum[i]);
            }
        }
    }
}
