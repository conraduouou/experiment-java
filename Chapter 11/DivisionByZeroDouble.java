/**
 * Exception class file of DivisionByZeroDouble which extends Exception
 * 
 * 03-25-2021
 */

public class DivisionByZeroDouble extends Exception
{
    // Default constructor
    // Exception message is set to default
    public DivisionByZeroDouble()
    {
        super("/ by zero");
    }

    // Constructor with parameters
    // Exception message is set to whatever message is inputted
    public DivisionByZeroDouble(String message)
    {
        super(message);
    }
}
