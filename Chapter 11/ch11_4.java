/**
 * Program that deals with people's dates of birth and throws
 * an exception if it's invalid
 * 
 * 03-25-2021
 */
import java.util.*;

public class ch11_4 extends ExtDate
{
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        String input;
        int mon, day, year;

        // title
        System.out.println("IS THE DATE VALID?!?!?!?!");

        try
        {
            // prompt
            System.out.print("Input desired date for validity: ");
            input = console.next();

            mon = Integer.parseInt(storeInt(input));

            if (mon < 1 || mon > 12)
                throw new InvalidMonthException();

            if (input.length() == storeInt(input).length())
                throw new Exception();

            input = input.substring(storeInt(input).length() + 1);

            day = Integer.parseInt(storeInt(input));

            if (input.length() == storeInt(input).length())
                throw new Exception();

            input = input.substring(storeInt(input).length() + 1);
            
            year = Integer.parseInt(input);

            if (day < 1 || day > daysinMonth(mon, year))
                throw new InvalidDayException();

            // make date if all is well and done
            ExtDate date = new ExtDate(mon, day, year);

            // and finally print date
            date.printWordDate();
        }
        catch (InvalidMonthException imeRef)
        {
            System.out.println("E R R O R: " + imeRef.getMessage());
        }
        catch (InvalidDayException ideRef)
        {
            System.out.println("E R R O R: " + ideRef.getMessage());
        }
        catch (Exception eRef)
        {
            System.out.println("E R R O R");
        }
        
    }

    // Method that finds and returns first valid int as a string
    static String storeInt(String temp1)
    {
        String temp2 = "";

        int i = 0;
        while (temp1.charAt(i) >= 48 && temp1.charAt(i) <= 57)
        {
            temp2 += temp1.charAt(i);

            i++;

            if (i >= temp1.length())
                break;
        }

        return temp2;
    }
}
