/**
 * Class file that includes all search algorithms in my life that I've come to learn
 * 
 * 03-30-2021
 */

public class Search 
{
    // method that finds elements via binary search
    // only works when array is sorted
    // Postcondition: location is returned, if not found, -1 is returned
    public static int binarySearch(int[] list, int length, int element)
    {
        int first = 0;
        int last = length - 1;
        int mid = 0;

        boolean found = false;

        while (first <= last && !found)
        {
            mid = (first + last) / 2;

            if (list[mid] == element)
                found = true;
            else if (list[mid] > element)
                last = mid - 1;
            else
                first = mid + 1;
        }

        if (found)
            return mid;
        else
            return -1;
    }

    // method that finds elements via binary search
    // only works when array is sorted
    // Postcondition: location is returned, if not found, -1 is returned
    public static int binarySearch(double[] list, int length, double element)
    {
        int first = 0;
        int last = length - 1;
        int mid = 0;

        boolean found = false;

        while (first <= last && !found)
        {
            mid = (first + last) / 2;

            if (list[mid] == element)
                found = true;
            else if (list[mid] > element)
                last = mid - 1;
            else
                first = mid + 1;
        }

        if (found)
            return mid;
        else
            return -1;
    }

    // method that finds elements via binary search
    // only works when array is sorted
    // Postcondition: location is returned, if not found, -1 is returned
    public static int binarySearch(char[] list, int length, char element)
    {
        int first = 0;
        int last = length - 1;
        int mid = 0;

        boolean found = false;

        while (first <= last && !found)
        {
            mid = (first + last) / 2;

            if (list[mid] == element)
                found = true;
            else if (list[mid] > element)
                last = mid - 1;
            else
                first = mid + 1;
        }

        if (found)
            return mid;
        else
            return -1;
    }

    // method that returns first occurrence of element in a sorted/unsorted array
    // Postcondition = location is returned, otherwise, -1 is returned
    public static int sequentialSearch(int[] list, int size, int element)
    {
        for (int i = 0; i < size; i++)
        {
            if (list[i] == element)
                return i;
        }

        return -1;
    }
}
