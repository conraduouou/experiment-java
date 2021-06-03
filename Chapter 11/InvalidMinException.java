/**
 * Class file of InvalidMinException that extends Exception
 * 
 * 03-25-2021
 */

public class InvalidMinException extends Exception
{
    // Default constructor
    // Exception class is set to default
    public InvalidMinException()
    {
        super("Invalid minute input. Must only contain values 0 to 59");
    }

    // Constructor with parameters
    // Exception class message is set according to string parameter
    public InvalidMinException(String message)
    {
        super(message);
    }
    
}
