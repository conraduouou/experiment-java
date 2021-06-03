/**
 * Program that takes a file and reads it as its input
 * and calculates how many students are in every cluster of score
 * 
 * 03-21-2021
 */
import java.util.*;
import java.io.*;

public class ch9_4
{
    public static void printArray(int[] list)
    {
        for (int i = 0; i < list.length; i++)
        {
            System.out.println((25 * i) + "-" + (25 * (i + 1)) + ": " + list[i]);
        }
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner inFile = new Scanner(new FileReader("ch9_4test.txt"));
        
        int[] array = new int[8];

        // loop algorithm to record each score accordingly in the list
        while (inFile.hasNext())
        {
            boolean flag = false;       // a flag to stop algorithm for current number
            int temp = inFile.nextInt();
            
            int i = 0;

            while (!flag && i < 8)
            {
                if (temp < (25 * (i + 1)))
                {
                    array[i]++;
                    flag = true;
                }
                else
                    i++;
            }
        }

        printArray(array);
    }
}
