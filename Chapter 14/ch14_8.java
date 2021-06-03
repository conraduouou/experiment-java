/**
 * Program that demonstrates selection sort in a 
 * Vector list
 * 
 * 03-31-2021
 */
import java.util.Vector;

public class ch14_8
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

        selSort(list, list.size());

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.elementAt(i));
    }

    public static void selSort(Vector<String> list, int lastIndex)
    {
        String min;
        String temp;
        boolean found = false;
        int location = 0;

        for (int i = 0; i < lastIndex; i++)
        {
            min = list.elementAt(i);
            found = false;

            for (int j = i + 1; j < lastIndex; j++)
            {
                if (list.elementAt(j).compareTo(min) < 0)
                {
                    found = true;
                    min = list.elementAt(j);
                    location = j;
                }
            }
            
            if (found)
            {
                temp = list.elementAt(i);
                list.setElementAt(min, i);
                list.setElementAt(temp, location);
            }
        }
    }
}
