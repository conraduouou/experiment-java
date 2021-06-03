/**
 * Class for Date
 * 
 * 03-22-2021
 */

public class Date
{
    private int dMonth;     // variable to store the month
    private int dDay;       // variable to store the day
    private int dYear;      // variable to store the year

    // Default constructor
    // The instance variables dMonth, dDay, and dYear are set to
    // the default values
    // Postcondition: dMonth = 1; dDay = 1; dYear = 1900;
    public Date()
    {
        dMonth = 1;
        dDay = 1;
        dYear = 1900;
    }

    // Constructor to set the date
    // The instance variables dMonth, dDay, and dYear are set
    // according to parameters
    // Postcondition: dMonth = month; dDay = day; dYear = year;
    public Date(int month, int day, int year)
    {
        setDate(month, day, year);
    }

    // Copy constructor
    // The instance variables dMonth, dDay, and dYear are set
    // according to parameters of otherDate
    // Postcondition: dMonth = otherDate.dMonth; dDay = otherDate.dDay; dYear = otherDate.dYear;
    public Date(Date otherDate)
    {
        setDate(otherDate.dMonth, otherDate.dDay, otherDate.dYear);
    }

    // Make a copy of the object
    // The instance variables dMonth, dDay, and dYear are used as parameters for making
    // a new instance of this object, and is returned
    public Date getCopy()
    {
        Date temp = new Date(getMonth(), getDay(), getYear());

        return temp;
    }

    // Method to copy parameters of otherDate to current Date object
    // The instance variables dMonth, dDay, and dYear of otherDate are used as parameters
    // for setting new parameters of current Date object
    public void makeCopy(Date otherDate)
    {
        setDate(otherDate.dMonth, otherDate.dDay, otherDate.dYear);
    }

    // Method to set the date
    // The instance variables dMonth, dDay, and dYear are set to
    // according to parameters
    // Postcondition: dMonth = month; dDay = day; dYear = year;
    public void setDate(int month, int day, int year)
    {
        dYear = year;
        setMonth(month);
        setDay(day);
    }

    // Method to set the month
    // Postcondition: the instance variable dMonth is assigned the value month,
    // while also paying attention to constraints
    public void setMonth(int month)
    {
        if (month < 1)
            dMonth = 1;
        else if (month > 12)
            dMonth = 12;
        else
            dMonth = month;
    }

    // Method to set the day
    // Postcondition: the instance variable dDay is assigned the value day,
    // while paying attention to constraints
    public void setDay(int day)
    {
        if (day < 1)
            dDay = 1;
        else if (day > daysinMonth())
            dDay = daysinMonth();
        else
            dDay = day;
    }

    // Method to set the year
    // Postcondition: the instance variable dYear is assigned the variable year
    public void setYear(int year)
    {
        dYear = year;
    }

    // Method to check if current year is leap year
    // Postcondition: returns true if divisible by four, false if otherwise
    public boolean isLeapYear()
    {
        if (dYear % 4 == 0)
            return true;
        
        return false;
    }

    // Method to check if year is leap year
    // Postcondition: returns true if divisible by four, false if otherwise
    public boolean isLeapYear(int year)
    {
        if (year % 4 == 0)
            return true;
        
        return false;
    }

    // Method that returns how many days there are in current month
    // Postcondition: max days in month is returned
    public int daysinMonth()
    {
        int temp = getMonth();
        boolean flag = false;

        if (temp > 7)
        {
            temp -= 7;
            flag = true;
        }

        switch (temp % 2)
        {
            case 1:
                return 31;
            case 0:
                if (temp == 2 && flag == false && isLeapYear())
                    return 29;
                else if (temp == 2 && flag == false)
                    return 28;
                else
                    return 30;
            default:
                return 0;
        }
    }

    // Method that returns how many days there are in passed value
    // Postcondition: max days in month num is returned
    public int daysinMonth(int num)
    {
        if (num > 12)
            num = 12;
        else if (num < 1)
            num = 1;

        int temp = num;
        boolean flag = false;

        if (temp > 7)
        {
            temp -= 7;
            flag = true;
        }

        switch (temp % 2)
        {
            case 1:
                return 31;
            case 0:
                if (temp == 2 && flag == false && isLeapYear())
                    return 29;
                else if (temp == 2 && flag == false)
                    return 28;
                else
                    return 30;
            default:
                return 0;
        }
    }

    // Method that returns how many days are passed in the year
    // Postcondition: total number of days passed is returned
    public int daysPassed()
    {
        int daysPassed = 0;

        for (int i = 1; i < getMonth(); i++)
            daysPassed += daysinMonth(i);
        
        return daysPassed += getDay();
    }

    // Method that returns how many days are remaining according to date
    // Postcondition: total number of days remaining is returned
    public int daysRemaining()
    {
        if (isLeapYear())
            return 366 - daysPassed();

        return 365 - daysPassed();
    }

    // Method that adds parameter num to current days and calculates date accordingly
    // Method is set up so that it also accepts negative integers
    // Postcondition: date is manipulated accordingly
    public void addDays(int num)
    {
        if (num >= 0)
        {
            while (dDay + num > daysinMonth())
            {
                num -= (daysinMonth() + 1) - getDay();
                addMonths(1);
                setDay(1);
            }

            dDay += num;
        }
        else
        {
            while (dDay + num < 1)
            {
                num += getDay();
                addMonths(-1);
                setDay(daysinMonth());
            }

            dDay += num;
        }
    }

    // Method that adds parameter num to current month and calculates date accordingly
    // Method is set up so that it also accepts negative integers
    // Postcondition: date is manipulated accordingly
    public void addMonths(int num)
    {
        int temp = getMonth() + num;

        if (num >= 0)
        {
            while (temp > 12)
            {
                temp -= 12;
                dYear++;
            }
        }
        else
        {
            while (temp < 1)
            {
                temp += 12;
                dYear--;
            }
        }

        // this is to ensure that the day, if at maximum, will always be set accordingly
        setDate(temp, getDay(), getYear());
    }
    
    // Method to return the month
    // Postcondition: The value of dMonth is returned
    public int getMonth()
    {
        return dMonth;
    }

    // Method to return the day
    // Postcondition: The value of dDay is returned
    public int getDay()
    {
        return dDay;
    }

    // Method to return the year
    // Postcondition: The value of dYear is returned
    public int getYear()
    {
        return dYear;
    }

    public int compareTo(Date otherDate)
    {
        if (getYear() > otherDate.getYear())
            return 1;
        else if (getYear() < otherDate.getYear())
            return -1;
        else
        {
            if (getMonth() > otherDate.getMonth())
                return 1;
            else if (getMonth() < otherDate.getMonth())
                return -1;
            else
            {
                if (getDay() > otherDate.getDay())
                    return 1;
                else if (getDay() < otherDate.getDay())
                    return -1;
                else
                    return 0;
            }
        }
    }

    // Method to return the date in the form mm-dd-yyyy
    public String toString()
    {
        return (dMonth + "-" + dDay + "-" + dYear);
    }
}