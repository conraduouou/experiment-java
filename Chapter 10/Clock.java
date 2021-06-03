/**
 * Class file of clock according to chapter 8
 * 
 * 03-17-2021
 */

public class Clock
{
    // variables to store hours, mins, secs
    private int hr;
    private int min;
    private int sec;

    // Default constructor
    // Postcondition: hr = 0; min = 0; sec = 0;
    public Clock()
    {
        setTime(0, 0, 0);
    }

    // Constructor with parameters
    // Postcondition: hr = hours; min = mins; sec = secs;
    public Clock(int hours, int mins, int secs)
    {
        setTime(hours, mins, secs);
    }

    // Constructor that allows user to copy used Clock object parameter instance variables
    // to new Clock object's instance variables accordingly
    // Postcondition: otherClock instance variables are copied accordingly to a new Clock object
    public Clock(Clock otherClock)
    {
        setTime(otherClock.hr, otherClock.min, otherClock.sec);
    }

    // Method to set the time
    // Postcondition: hr = hours; min = mins; sec = secs;
    public void setTime(int hours, int mins, int secs)
    {
        if (0 <= hours && hours < 24)
            hr = hours;
        else
            hr = 0;
        
        if (0 <= mins && mins < 60)
            min = mins;
        else
            min = 0;

        if (0 <= secs && secs < 60)
            sec = secs;
        else
            secs = 0;
    }

    // Mutator method to set hours
    // Postcondition: hr = hours;
    public void setHours(int hours)
    {
        hr = hours;
    }

    // Mutator method to set minutes
    // Postcondition: min = mins;
    public void setMinutes(int mins)
    {
        min = mins;
    }

    // Mutator method to set seconds
    // Postcondition: sec = secs;
    public void setSeconds(int secs)
    {
        sec = secs;
    }

    // Method to return the hours
    // Postcondition: the value of hr is returned
    public int getHours()
    {
        return hr;
    }

    // Method to return the minutes
    // Postcondition: the value of min is returned
    public int getMinutes()
    {
        return min;
    }

    // Method to return the seconds
    // Postcondition: the value of sec is returned
    public int getSeconds()
    {
        return sec;
    }

    // Method to print the time
    // Postcondition: Time is printed in the form hh: mm: ss
    public void printTime()
    {
        if (hr < 10)
            System.out.print("0");
        System.out.print(hr + ":");

        if (min < 10)
            System.out.print("0");
        System.out.print(min + ":");

        if (sec < 10)
            System.out.print("0");
        System.out.print(sec + ":");
    }

    // Method to increment the time by one second
    // Postcondition: The time is incremented by one second
    // If the before-increment time is 23:59:59, the time is reset to 00:00:00
    public void incrementSeconds()
    {
        sec++;

        if (sec > 59)
        {
            sec = 0;
            incrementMinutes(); // add 1 to minutes
        }
    }

    // Method to decrement the time by one second
    // Postcondition: The time is decremented by one second
    // If the before-decrement time is 00:00:00, the time is set to 23:59:59
    public void decrementSeconds()
    {
        sec--;

        if (sec < 0)
        {
            sec = 59;
            decrementMinutes(); // diminish 1 to minutes
        }
    }

    // Method to increment the time by one minute
    // Postcondition: The time is incremented by one minute
    // If the before-increment time is 23:59:00, the time is set to 00:00:00
    public void incrementMinutes()
    {
        min++;

        if (min > 59)
        {
            min = 0;
            incrementHours();   // add 1 to hours
        }
    }

    // Method to decrement the time by one minute
    // Postcondition: The time is decremented by one minute
    // If the before-decrement time is 00:00:00, the time is set to 23:59:00
    public void decrementMinutes()
    {
        min--;

        if (min < 0)
        {
            min = 59;
            decrementHours();   // diminish 1 to hours
        }
    }

    // Method to increment the time by one hour
    // Postcondition: The time is incremented by one hour
    // If the before-time increment time is 23:00:00, the time is set to 00:00:00
    public void incrementHours()
    {
        hr++;

        if (hr > 23)
            hr = 0;
    }

    public void decrementHours()
    {
        hr--;

        if (hr < 0)
            hr = 23;
    }

    // Method to compare two times
    // Postcondition: Returns true if the corresponding values of hr, min, and sec
    // are equal, otherwise, it returns false
    public boolean equals(Clock otherClock)
    {
        return (hr == otherClock.hr && min == otherClock.min && sec == otherClock.sec);
    }

    // Method to copy time
    // Postcondition: Corresponding instance variables are copied to other Clock instance variables
    public void makeCopy(Clock otherClock)
    {
        hr = otherClock.hr;
        min = otherClock.min;
        sec = otherClock.sec;
    }

    // Method to return a copy of current time
    // Postcondition: A copy of the object is created and a reference of the copy is returned
    public Clock getCopy()
    {
        Clock temp = new Clock();

        temp.hr = hr;
        temp.min = min;
        temp.sec = sec;

        return temp;
    }

    // Method to return when Clock object is called in a print function
    // Postcondition: The string with format hh:mm:ss is returned
    public String toString()
    {
        String str = "";

        if (hr < 10)
            str = "0";
        str = str + hr + ":";
        
        if (min < 10)
            str = str + "0";
        str = str + min + ":";

        if (sec < 10)
            str = str + "0";
        str = str + sec;

        return str;
    }
}