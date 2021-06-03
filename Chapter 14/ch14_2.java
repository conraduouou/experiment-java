/**
 * Program that implements removal of an element in an array
 * 
 * 03-30-2021
 */

public class ch14_2
{
    public static void main(String[] arg)
    {
        int[] array = {526, 41221, 523, 6346, 124, 63643, 86785, 42, 6341, 522, 75, 4321, 53};

        Sort.insertionSort(array, array.length);

        remove(array, array.length, 6341);

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    // method that 'removes' specified element and in turn, 'shrinks' the array size
    public static void remove(int[] list, int size, int removeItem)
    {
        int temp = Search.sequentialSearch(list, size, removeItem);

        if (temp == -1)
            return;
        
        for (int i = 0; i < size; i++)
        {
            if (i == size - 1)
                list[i] = 0;
            else if (i >= temp)
                list[i] = list[i + 1];
        }
    }
}