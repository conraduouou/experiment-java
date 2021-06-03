/**
 * Program that implements removal of an element specified by an index in an array
 * 
 * 03-30-2021
 */

public class ch14_3
{
    public static void main(String[] arg)
    {
        int[] array = {526, 41221, 523, 6346, 124, 63643, 86785, 42, 6341, 522, 75, 4321, 53};

        Sort.insertionSort(array, array.length);

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);

        removeAt(array, array.length, 7);
        System.out.println();

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    // method that 'removes' specified element and in turn, 'shrinks' the array size
    public static void removeAt(int[] list, int size, int index)
    {
        if (index >= size || index < 0)
        {
            System.out.println("Array Index out of bounds");
            return;
        }

        for (int i = 0; i < size; i++)
        {
            if (i == size - 1)
                list[i] = 0;
            else if (i >= index)
                list[i] = list[i + 1];
        }
    }
}