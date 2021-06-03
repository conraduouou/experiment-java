/**
 * Converter GUI program that lets user enter length in feet and inches
 * and outputs the length in inches and in centimeters
 */
import java.util.*;

public class Converter 
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        // variables to store values
        double feet, inches, centimeters;

        System.out.println("FEET AND INCHES TO INCHES AND CENTIMETERS?!?!?!");

        try
        {
            // prompt
            System.out.print("Enter feet to convert: ");
            feet = console.nextDouble();

            if (feet < 0)
                throw new NegativeNumberException();

            System.out.print("Enter inches that are extra: ");
            inches = console.nextDouble();

            if (inches < 0)
                throw new NegativeNumberException();
            
            inches += 12 * feet;

            centimeters = 2.54 * inches;

            System.out.println("Inches: " + inches + "\n" + "Centimeters: " + centimeters);
        }
        catch (NegativeNumberException nnRef)
        {
            System.out.println("E R R O R: Negative cannot be input in distance calculations.");
        }
        catch (InputMismatchException imRef)
        {
            System.out.println("E R R O R: Invalid entry on what supposed to be a double/integer value.");
        }

    }
}