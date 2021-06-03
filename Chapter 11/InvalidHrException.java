/**
 * Class file of InvalidHrException that extends Exception
 * 
 * 03-25-2021
 */

public class InvalidHrException extends Exception
{
    // Default constructor
    // Exception class is set to default
    public InvalidHrException()
    {
        super("Invalid hour input. Must only contain values 1 to 12");
    }

    // Constructor with parameters
    // Exception class message is set according to string parameter
    public InvalidHrException(String message)
    {
        super(message);
    }
    
}
