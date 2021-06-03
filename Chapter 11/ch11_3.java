/**
 * Program that prompts user to input time in 12-hour notation
 * and then outputs the corresponding 24 hour notation
 * 
 * 03-25-2021
 */
import java.util.*;

public class ch11_3
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        // variable to store the string entered by the user
        String time, half;
        int hour, min, sec;

        System.out.println("12 HOUR TO 24 HOUR?!?!!?!??!!");

        // prompt
        System.out.println("Enter time (including seconds) in 12-hour notation:");
        time = console.next();

        System.out.println("Enter time half (AM or PM):");
        half = console.next();

        try
        {
            // store hour and cut time accordingly
            hour = Integer.parseInt(storeInt(time));

            // throw created exception if hour is invalid
            if (hour < 1 || hour > 12)
                throw new InvalidHrException();
                
            if (time.length() == storeInt(time).length())
                throw new Exception();

            time = time.substring(storeInt(time).length() + 1);
            

            // store minute and cut time accordingly
            min = Integer.parseInt(storeInt(time));

            // throw created exception if minute is invalid
            if (min < 0 || min > 59)
                throw new InvalidMinException();
            
            if (time.length() == storeInt(time).length())
                throw new Exception();

            time = time.substring(storeInt(time).length() + 1);

            // store hour and cut time accordingly
            sec = Integer.parseInt(storeInt(time));

            // throw created exception if second is invalid
            if (sec < 0 || sec > 59)
                throw new InvalidSecException();

            if (half.toUpperCase().equals("AM"))
                System.out.println(String.format("%02d:%02d:%02d", hour, min, sec));
            else if (half.toUpperCase().equals("PM"))
                System.out.println(String.format("%02d:%02d:%02d", hour + 12, min, sec));
        }
        catch (InvalidHrException ihRef)
        {
            System.out.println("E R R O R: " + ihRef.getMessage());
        }
        catch (InvalidMinException imRef)
        {
            System.out.println("E R R O R: " + imRef.getMessage());
        }
        catch (InvalidSecException isRef)
        {
            System.out.println("E R R O R: " + isRef.getMessage());
        }
        catch (Exception eRef)
        {
            System.out.println("E R R O R");
        }
    }

    static String storeInt(String time)
    {
        String temp = "";

        int i = 0;
        while (time.charAt(i) >= 48 && time.charAt(i) <= 57)
        {
            temp += time.charAt(i);

            i++;

            if (i >= time.length())
                break;
        }

        return temp;
    }
}
