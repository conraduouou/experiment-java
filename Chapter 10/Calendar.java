/**
 * Class file Calendar that extends ExtDate
 */

public class Calendar extends ExtDate
{
    private Day dayOfTheWeek = new Day();       // variable to store what day of the week the current day is
    private int[][] calendar = new int[6][7];   // variable to store the calendar to print

    // Default constructor
    // Postcondition: date is set to default values and as well as the day of the week
    public Calendar()
    {
        super();
        dayOfTheWeek.setDay(dayOfTheMonth());
    }

    // Constructor with parameters
    // Postcondition: date is set according to parameters
    public Calendar(int month, int day, int year)
    {
        super(month, day, year);
        dayOfTheWeek.setDay(dayOfTheMonth());
    }

    // Constructor with parameters
    // Postcondition: date is set according to parameters
    public Calendar(int month, int year)
    {
        super(month, year);
        dayOfTheWeek.setDay(dayOfTheMonth());
    }

    // Constructor with string parameter as 1st parameter
    // Postcondition: date is set according to parameters
    public Calendar(String month, int day, int year)
    {
        super(month, day, year);
        dayOfTheWeek.setDay(dayOfTheMonth());
    }

    // Method to return what day of the week a certain day is in a month
    // Postcondition: Numbers 0 - 6 is returned
    private int firstDayOfTheMonth()
    {
        int k = 1;
        int m = getMonth() - 2;
        int d = getYear() % 100;
        int c = getYear() / 100;

        if (m < 0)
        {
            m += 12;
            d--;
        }

        int F = k + ((13 * m - 1) / 5) + d + (d / 4) + (c / 4) - (2 * c);

        int i = 1;
        if (F >= 0)
            F %= 7;
        else if (F < 0)
        {
            while (7 * -i > F)
                i++;
            
            F -= 7 * -i;
        }

        return F;
    }

    // Method to return what day of the week the current day is in a month
    // Postcondition: Numbers 0 - 6 is returned
    private int dayOfTheMonth()
    {
        int k = getDay();
        int m = getMonth() - 2;
        int d = getYear() % 100;
        int c = getYear() / 100;

        if (m < 0)
        {
            m += 12;
            d--;
        }

        int F = k + ((13 * m - 1) / 5) + d + (d / 4) + (c / 4) - (2 * c);

        int i = 1;
        if (F >= 0)
            F %= 7;
        else if (F < 0)
        {
            while (7 * -i > F)
                i++;
            
            F -= 7 * -i;
        }

        return F;
    }

    // Method to return the string day of the week
    // Postcondition : days in string form is returned
    public String getDayOfTheWeek()
    {
        return dayOfTheWeek.getDay();
    }

    public void printCalendar()
    {
        setCalendar();

        System.out.println(String.format("%35s", super.toString()));
        System.out.println(String.format("%7s%7s%7s%7s%7s%7s%7s", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"));

        for (int i = 0; i < calendar.length; i++)
        {
            for (int j = 0; j < calendar[i].length; j++)
            {
                if (calendar[i][j] == 0)
                    System.out.print(String.format("%7s", " "));
                else
                    System.out.print(String.format("%7d", calendar[i][j]));
            }

            System.out.println();
        }
    }

    // Private method to set the calendar
    // Postcondition: days are arranged calendar-wise in an array
    private void setCalendar()
    {
        int count = 1;

        for (int i = firstDayOfTheMonth(); i < calendar[0].length; i++)
            calendar[0][i] = count++;
        
        for (int i = 1; i < calendar.length && count <= daysinMonth(); i++)
            for (int j = 0; j < calendar[i].length && count <= daysinMonth(); j++)
                calendar[i][j] = count++;
    }

    // Method inexplicitly called when used in a print function
    public String toString()
    {
        return super.toString();
    }

    public static void main(String[] args)
    {
        // test out method
        Calendar temp = new Calendar(03, 2021);

        temp.setDate(03, 20, 2021);

        temp.printCalendar();
    }
}