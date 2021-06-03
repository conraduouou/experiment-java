/**
 * Class file of ExtDate that extends Date
 */

public class ExtDate extends Date
{
    private String wordMonth;

    // Default constructor
    // Sets values to default
    // Postcondition: 01-01-1990, January
    public ExtDate()
    {
        super();
        setMonth("january");
    }

    // Constructor with parameters
    // sets values according to parameters
    // Postcondition: dMonth = month, dDay = day, dYear = year, wordMonth is month converted
    public ExtDate(int month, int day, int year)
    {
        super(month, day, year);

        wordMonth = monthToString(month);
    }

    // Constructor with parameters
    // sets values according to parameters
    // Postcondition: dMonth = month, dDay = day, dYear = year, wordMonth is month converted
    public ExtDate(int month, int year)
    {
        super(month, 1, year);

        wordMonth = monthToString(month);
    }

    // Constructor with parameters
    // sets values according to parameters
    // Postcondition: wordMonth = month, dDay = day, dYear = year, dMonth is wordMonth converted
    public ExtDate(String month, int day, int year)
    {
        setMonth(month);

        super.setDate(stringToMonth(getStringMonth()), day, year);
    }

    // Method to override setMonth method of superclass
    // Postcondition: the instance variable dMonth is assigned the value month,
    // while also paying attention to constrainsts and as well as the string wordMonth
    public void setMonth(int month)
    {
        super.setMonth(month);

        wordMonth = monthToString(super.getMonth());
    }

    // Method to override setMonth method of superclass
    // Postcondition: the instance variable wordMonth is assigned the string month,
    // while also paying attention to constrainsts and as well as the instance variable dMonth
    public void setMonth(String month)
    {
        switch (month.toLowerCase())
        {
            case "january": wordMonth = "January"; break;
            case "february": wordMonth = "February";break;
            case "march": wordMonth = "March"; break;
            case "april": wordMonth = "April"; break;
            case "may": wordMonth = "May"; break;
            case "june": wordMonth = "June"; break;
            case "july": wordMonth = "July"; break;
            case "august": wordMonth = "August"; break;
            case "september": wordMonth = "September"; break;
            case "october": wordMonth = "October"; break;
            case "november": wordMonth = "November"; break;
            case "december": wordMonth = "December"; break;
            default:
                wordMonth = "January";
        }

        super.setMonth(stringToMonth(wordMonth));
    }

    // Accessor method used to acquire value of wordMonth
    // Postcondition: wordMonth is returned
    public String getStringMonth()
    {
        return wordMonth;
    }

    // Methods to convert string to corresponding month
    // Postcondition: int value of month is returned
    public int stringToMonth(String month)
    {
        switch (month.toLowerCase())
        {
            case "january": return 1;
            case "february": return 2;
            case "march": return 3;
            case "april": return 4;
            case "may": return 5;
            case "june": return 6;
            case "july": return 7;
            case "august": return 8;
            case "september": return 9;
            case "october": return 10;
            case "november": return 11;
            case "december": return 12;
            default:
                return 1;
        }
    }

    // Methods to convert int month to corresponding month
    // Postcondition: string value of month is returned
    public String monthToString(int month)
    {
        switch (month)
        {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default:
                return "January";
        }
    }

    // Method used to print date in numbered form
    public void printNumberDate()
    {
        System.out.println(super.getMonth() + "-" + super.getDay() + "-" + super.getYear());
    }

    // Method used to print date in worded form
    public void printWordDate()
    {
        System.out.println(getStringMonth() + " " + super.getDay() + ", " + super.getYear());
    }

    // Method inexplicitly used when called in a print function
    public String toString()
    {
        return wordMonth + " " + super.getYear(); 
    }
}