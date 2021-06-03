/**
 * Class file that contains all sort algorithms that I've come to learn in my life
 * 
 * 03-30-2021
 */

public class Sort
{
    // method that sorts array via Insertion Sort with specific size
    // Postcondition = array is sorted
    public static void insertionSort(int[] list, int size)
    {
        int temp;
        int placeToPut;

        for (int i = 1; i < size; i++)
        {
            if (list[i] < list[i - 1])
            {
                temp = list[i];
                placeToPut = i;

                do
                {
                    list[placeToPut] = list[placeToPut - 1];
                    placeToPut--;
                }
                while (placeToPut > 0 && list[placeToPut - 1] > temp);

                list[placeToPut] = temp;
            }
        }
    }

    // method that sorts array via Selection Sort
    // Postcondition = array is sorted
    public static void selectionSort(int[] list, int size)
    {
        int temp = 0;
        int location = 0;

        int min;
        boolean flag = false;

        for (int i = 0; i < size; i++)
        {
            min = list[i];
            flag = false;

            for (int j = i + 1; j < size; j++)
            {
                if (list[j] < min)
                {
                    min = list[j];
                    location = j;
                    flag = true;
                }
            }

            if (flag)
            {
                temp = list[i];
                list[i] = list[location];
                list[location] = temp;
            }
        }
    }
}
