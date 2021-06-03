/**
 * Program that demonstrates insertAt method which inserts
 * specified int in an array
 */

public class ch14_6
{
    public static void main(String[] args)
    {
        int[] array = {742, 523, 7, 78, 523, 325, 52352, 523, 325, 235, 523, 523};

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
        
        System.out.println();

        insertAt(array, array.length, 90, 7);
        
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    public static void insertAt(int[] list, int size, int insertItem, int index)
    {
        int temp;

        if (index < 0 || index >= size)
        {
            System.out.println("INVALID INDEX FOUND");
            return;
        }

        for (int i = index; i < size; i++)
        {
            temp = list[i];
            list[i] = insertItem;
            insertItem = temp;
        }
    }
}
