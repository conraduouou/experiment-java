/**
 * Program that stores the temperatures (high and low) recorded every month in a year that contains
 * methods to get the data accordingly from a single array
 * 
 * 03-21-2021
 */
import java.util.*;

public class ch9_11
{
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        // array to hold temperatures
        double[][] temperatures = new double[12][2];

        System.out.println("TEMPERATURE METHODS!!");

        for (int i = 0; i < temperatures.length; i++)
        {
            System.out.println("Input highest and lowest temperatures for month " + (i + 1));
            
            for (int j = 0; j < temperatures[i].length; j++)
            {
                getData(console.nextDouble(), temperatures[i]);
            }
        }

        System.out.println("The average of high temperatures in the year was " + averageHigh(temperatures));
        System.out.println("The average of low temperatures in the year was " + averageLow(temperatures));
        System.out.println("The index of the highest temperature in the year is " + indexHighTemp(temperatures));
        System.out.println("The index of the lowest temperature in the year is " + indexLowTemp(temperatures));
    }

    // method to set temperature accordingly on an array of temperatures
    public static void getData(double temp, double[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 0)
            {
                array[i] = temp;
            }
        }
    }

    // method that gets the average high temperatures in a year
    public static double averageHigh(double[][] array)
    {
        double sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            sum += array[i][1];
        }

        return (sum / array.length);
    }

    // method that gets the average low temperatures in a year
    public static double averageLow(double[][] array)
    {
        double sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            sum += array[i][0];
        }

        return (sum / array.length);
    }

    // method that returns index of highest temp
    public static int indexHighTemp(double[][] array)
    {
        double max = 0;
        int highIndex = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (max < array[i][1])
            {
                max = array[i][1];
                highIndex = i;
            }
        }

        return highIndex;
    }

    // method that returns index of lowest temp
    public static int indexLowTemp(double[][] array)
    {
        double min = 999;
        int lowIndex = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (min > array[i][1])
            {
                min = array[i][1];
                lowIndex = i;
            }
        }

        return lowIndex;
    }
}
