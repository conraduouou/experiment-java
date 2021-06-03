/**
 * Program that uses binary search for searching
 * a Vector list
 * 
 * 03-31-2021
 */
import java.util.Vector;

public class ch14_11
{
    public static void main(String[] heyheyhey)
    {
        Vector<String> list = new Vector<String> (10);

        list.add("Anna");
        list.add("Louise");
        list.add("HeyhEy");
        list.add("Myla");
        list.add("Joel");
        list.add("Patricia");
        list.add("Maricarl");
        list.add("Hey?");
        list.add("Julios");
        list.add("Fendoor");

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.elementAt(i));
        
        System.out.println();

        inSort(list, list.size());

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.elementAt(i));

        System.out.println("The index of string Ptricia is at " + binarySearch(list, list.size(), "Patricia"));
    }

    public static void inSort(Vector<String> list, int lastIndex)
    {
        int location;
        String temp;

        for (int i = 1; i < lastIndex; i++)
        {
            if (list.elementAt(i).compareTo(list.elementAt(i - 1)) < 0)
            {
                temp = list.elementAt(i);
                location = i;

                do
                {
                    list.setElementAt(list.elementAt(location - 1), location);
                    location--;
                }
                while (location > 0 && list.elementAt(location - 1).compareTo(temp) > 0);

                list.setElementAt(temp, location);
            }
        }
    }

    public static int binarySearch(Vector<String> list, int range, String search)
    {
        int first = 0;
        int last = range - 1;
        int mid;

        while (first <= last)
        {
            mid = (first + last) / 2;

            if (list.elementAt(mid).compareTo(search) < 0)
                first = mid + 1;
            else if (list.elementAt(mid).compareTo(search) > 0)
                last = mid - 1;
            else
                return mid;
        }

        return -1;
    }
}