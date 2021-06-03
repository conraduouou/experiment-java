/**
 * Program that demonstrates sequential search in a 
 * Vector list
 * 
 * 03-31-2021
 */
import java.util.Vector;

public class ch14_7
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

        System.out.println("The index of string Maricarl is in " + sequentialSearch(list, "Maricarl"));
    }

    public static int sequentialSearch(Vector<String> list, String search)
    {
        for (int i = 0; i < list.size(); i++)
            if (list.elementAt(i).equalsIgnoreCase(search))
                return i;
        
        return -1;
    }
}
