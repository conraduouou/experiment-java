/**
 * Exception class file of InvalidDayException which extends Exception
 * 
 * 03-25-2021
 */

public class InvalidDayException extends Exception
{
    // Default constructor for exception
    // Exception class message is set to default
    public InvalidDayException()
    {
        super("Invalid input for day. Must be between 1 and month's max day.");
    }

    // Constructor with parameters
    // Exception class whose message is set to whatever is set as parameter
    public InvalidDayException(String message)
    {
        super(message);
    }
}
