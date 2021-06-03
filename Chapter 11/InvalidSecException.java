/**
 * Class file of InvalidSecException that extends Exception
 * 
 * 03-25-2021
 */

public class InvalidSecException extends Exception
{
    // Default constructor
    // Exception class is set to default
    public InvalidSecException()
    {
        super("Invalid second input. Must only contain values 0 to 59");
    }

    // Constructor with parameters
    // Exception class message is set according to string parameter
    public InvalidSecException(String message)
    {
        super(message);
    }
}
