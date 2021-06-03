/**
 * Class file of Negative Number Exception that extends superclass Exception
 */

public class NegativeNumberException extends Exception
{
    // Default constructor for exception
    // Postcondition: default message is used
    public NegativeNumberException()
    {
        super("Cannot input negative number.");
    }

    // Constructor with parameters for exception
    // Postcondition: messages used is according to parameter
    public NegativeNumberException(String message)
    {
        super(message);
    }
}