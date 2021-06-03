/**
 * Class that extends Clock class
 * 
 * 03-22-2021
 */

public class ExtClock extends Clock
{
    // instance variable timeZone
    private String timeZone;

    // Default constructor
    // Postcondition: superclass Clock is initialized and timeZone is set to GMT
    public ExtClock()
    {
        super();
        timeZone = "GMT";
    }

    // Constructor with parameters
    // Postcondition: hr = hours; min = mins; sec = secs; timeZone = zone;
    public ExtClock(int hours, int mins, int secs, String zone)
    {
        super(hours, mins, secs);
        timeZone = zone.toUpperCase();
    }

    // Accessor method that gets time zone
    // Postcondition: instance variable timeZone is returned
    public String getTimeZone()
    {
        return timeZone;
    }

    // Mutator method that changes time zone and time accordingly
    // Postcondition: timeZone = zone; current time values are changed accordingly
    public void changeTimeZone(String zone)
    {
        if (isTimeZone(zone) && isTimeZone(timeZone))
        {
            int temp = getZoneValue(zone) - getZoneValue(timeZone);
            super.setHours(super.getHours() + temp);
        }

        timeZone = zone;
    }

    // Private method that returns zone offset accordingly
    // Postcondition: returns value of hour offset based on String zone
    private int getZoneValue(String zone)
    {
        int temp;

        switch (zone.toUpperCase())
        {
            case "GMT": temp = 0; break;
            case "CET": temp = 1; break;
            case "EET": temp = 2; break;
            case "MSK": temp = 3; break;
            case "AMT": temp = 4; break;
            case "PKT": temp = 5; break;
            case "OMSK": temp = 6; break;
            case "KRAT": temp = 7; break;
            case "CST": temp = 8; break;
            case "JST": temp = 9; break;
            case "AEST": temp = 10; break;
            case "SAKT": temp = 11; break;
            case "NZST": temp = 12; break;
            default: temp = 0;
        }

        return temp;
    }

    // Boolean method that checks whether time zone passed is supported by program
    // Postcondition: returns true if supported, false if otherwise
    public boolean isTimeZone(String zone)
    {
        switch (zone.toUpperCase())
        {
            case "GMT": 
            case "CET": 
            case "EET": 
            case "MSK": 
            case "AMT": 
            case "PKT": 
            case "OMSK": 
            case "KRAT": 
            case "CST": 
            case "JST": 
            case "AEST": 
            case "SAKT": 
            case "NZST": 
                return true;
            default: 
                return false;
        }
    }

    // Method to make string when object is passed in a print method
    // Postcondition: timezone is appended to toString method of superclass
    public String toString()
    {
        return super.toString() + " " + timeZone;
    }
}