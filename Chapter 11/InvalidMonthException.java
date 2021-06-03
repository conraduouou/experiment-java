/**
 * Exception class file of InvalidMonthException which extends Exception
 * 
 * 03-25-2021
 */

public class InvalidMonthException extends Exception
{
    // Default constructor for exception
    // Exception class message is set to default
    public InvalidMonthException()
    {
        super("Invalid input for month. Must only be between 1 and 12.");
    }

    // Constructor with parameters
    // Exception class whose message is set to whatever is set as parameter
    public InvalidMonthException(String message)
    {
        super(message);
    }
}
