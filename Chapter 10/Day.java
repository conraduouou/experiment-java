/**
 * Program to make a class file called Day
 * 
 * 03-18-2021
 */

// class Day
public class Day
{
    private String day;
    private int nDay;

    // Default constructor
    // Postcondition: Sets current day as Monday
    public Day()
    {
        setDay("Monday");
    }

    // Constructor with string parameter
    // Postcondition: Sets current day as whatever the value of temp pertains, that is,
    // if it is even a day, otherwise, set it to default (Monday)
    public Day(String temp)
    {
        if (isDay(temp))
            setDay(temp);
        else
            setDay("Monday");
    }

    // Mutator method that sets day according to string temp
    // Postcondition: day = temp;
    public void setDay(String temp)
    {
        switch (temp.toLowerCase())
        {
            case "monday":
                day = "Monday";
                nDay = 0;
                break;
            case "tuesday":
                day = "Tuesday";
                nDay = 1;
                break;
            case "wednesday":
                day = "Wednesday";
                nDay = 2;
                break;
            case "thursday":
                day = "Thursday";
                nDay = 3;
                break;
            case "friday":
                day = "Friday";
                nDay = 4;
                break;
            case "saturday":
                day = "Saturday";
                nDay = 5;
                break;
            case "sunday":
                day = "Sunday";
                nDay = 6;
                break;
            default:
                day = "Monday";
        }
    }

    // Mutator method that sets day according to int (0 - 6)
    // Postcondition: day is set accordingly (0 = Monday, 1 = Tuesday...);
    public void setDay(int temp)
    {
        switch (temp)
        {
            case 0:
                day = "Monday";
                nDay = 0;
                break;
            case 1:
                day = "Tuesday";
                nDay = 1;
                break;
            case 2:
                day = "Wednesday";
                nDay = 2;
                break;
            case 3:
                day = "Thursday";
                nDay = 3;
                break;
            case 4:
                day = "Friday";
                nDay = 4;
                break;
            case 5:
                day = "Saturday";
                nDay = 5;
                break;
            case 6:
                day = "Sunday";
                nDay = 6;
                break;
            default:
                day = "Monday";
        }
    }

    // Method to check if temp is a day
    // Postcondition: returns true if it is a day, otherwise, returns false
    public boolean isDay(String temp)
    {
        switch (temp.toLowerCase())
        {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
            case "saturday":
            case "sunday":
                return true;
            default:
                return false;
        }
    }

    // Method to print day
    // Postcondition: prints day
    public void printDay()
    {
        System.out.print(day);
    }

    // Accessor method to get current set day
    // Postcondition: returns day as string
    public String getDay()
    {
        return day;
    }

    // Accessor method to get next day
    // Postcondition: returns next day as string
    public String getNextDay()
    {
        return incrementDay(1);
    }

    // Accessor method to get previous day
    // Postcondition: returns previous day as string
    public String getPreviousDay()
    {
        return decrementDay(1);
    }

    // Method to add to current day depending on int parameter
    // Does not change current day
    // Postcondition: adding 1 to Monday returns Tuesday
    public String incrementDay(int num)
    {
        while (num > 6)
            num -= 7;
        
        switch (nDay + num)
        {
            case 0:
                return "Monday";
            case 1:
                return "Tuesday";
            case 2:
                return "Wednesday";
            case 3:
                return "Thursday";
            case 4:
                return "Friday";
            case 5:
                return "Saturday";
            case 6:
                return "Sunday";
            default:
                return "Monday";
        }
    }

    // Method to subtract to current day depending on int parameter
    // Does not change current day
    // Postcondition: subtracting 1 to Monday returns Tuesday
    public String decrementDay(int num)
    {
        while (num > 6)
            num -= 7;
        
        switch (nDay - num)
        {
            case 0:
                return "Monday";
            case 1:
                return "Sunday";
            case 2:
                return "Saturday";
            case 3:
                return "Friday";
            case 4:
                return "Thursday";
            case 5:
                return "Wednesday";
            case 6:
                return "Tuesday";
            default:
                return "Monday";
        }
    }
}
