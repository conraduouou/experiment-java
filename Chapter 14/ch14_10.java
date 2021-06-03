/**
 * Program that uses insertion sort to sort
 * a Vector list
 * 
 * 03-31-2021
 */
import java.util.Vector;

public class ch14_10
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
}