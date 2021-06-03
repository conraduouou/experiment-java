/**
 * Program that demonstrates binary search
 * 
 * 03-30-2021
 */

public class ch14_1
{
    public static void main(String[] arg)
    {
        int[] array = {526, 41221, 523, 6346, 124, 63643, 86785, 42, 6341, 522, 75, 4321, 53};

        insertionSort(array, array.length);

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
        
        System.out.println("The element 124 is located in array location " + binarySearch(array, 124));
    }

    // method that sorts array via Insertion Sort
    public static void insertionSort(int[] list, int size)
    {
        int temp;
        int lastLocated;

        for (int i = 1; i < size; i++)
        {
            if (list[i] < list[i - 1])
            {
                temp = list[i];
                lastLocated = i;

                do
                {
                    list[lastLocated] = list[lastLocated - 1];
                    lastLocated--;
                }
                while (lastLocated > 0 && list[lastLocated - 1] > temp);

                list[lastLocated] = temp;
            }
        }
    }

    // method that finds elements via binary search
    public static int binarySearch(int[] list, int element)
    {
        int first = 0;
        int last = list.length - 1;
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
            return 0;
    }
}