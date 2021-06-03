/**
 * Program that demonstrates a removeAll method that removes
 * all instances of a specified integer
 * 
 * 03-31-2021
 */

public class ch14_4
{
    public static void main(String[] arg)
    {
        int[] array = {742, 523, 7, 78, 523, 325, 52352, 523, 325, 235, 523, 523};

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
        
        System.out.println();

        removeAll(array, array.length, 523);

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    public static void removeAll(int[] list, int size, int element)
    {
        int count;
        int temp;
        boolean finished = false;

        for (int i = 0; i < size && !finished; i++)
        {
            count = 0;

            if (list[i] != element)
                continue;
            else
            {
                while (list[i + count] == element)
                {
                    count++;

                    if (i + count == size - 1 && list[i + count] == element)
                    {
                        for (int j = i; j < size; j++)
                            list[j] = 0;
                    }
                }

                temp = list[i + count];
                list[i + count] = list[i];
                list[i] = temp;
            }
        }
    }
}