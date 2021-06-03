/**
 * Class file of AddressBook
 */

public class AddressBook
{
    private ExtPerson[] people;     // array to store all people in the AddressBook class
    private int peopleCount;        // variable to store number of people currently recorded

    // Default constructor
    // Values are set to default
    // Postcondition: array people is allocated with 500 slots, count is set to 0
    public AddressBook()
    {
        people = new ExtPerson[500];
        peopleCount = 0;
    }

    // Constructor with parameters
    // Number of people to record is set according to parameter
    // Postcondition: ExtPerson[count];
    public AddressBook(int count)
    {
        people = new ExtPerson[count];
        peopleCount = 0;
    }

    // Method to add person into list, which then updates peopleCount
    public void addPerson(ExtPerson temp)
    {
        peopleCount++;

        people[peopleCount - 1] = temp;
    }

    // Method to sort AddressBook according to last name
    // Postcondition: people array is sorted according to last name
    public void sortByLast()
    {
        ExtPerson temp;
        int count = 0;

        for (int i = 0; i < people.length; i++)
        {
            for (int j = i + 1; j < people.length; j++)
            {
                if (people[j].getLastName().toLowerCase().compareTo(people[i].getLastName().toLowerCase()) < 0)
                {
                    count = j;

                    temp = people[i];
                    people[i] = people[count];
                    people[count] = temp;
                }
            }
        }
    }

    // Method to sort AddressBook according to first name
    // Postcondition: people array is sorted according to first name
    public void sortByFirst()
    {
        ExtPerson temp;
        int count = 0;

        for (int i = 0; i < people.length; i++)
        {
            for (int j = i + 1; j < people.length; j++)
            {
                if (people[j].getFirstName().toLowerCase().compareTo(people[i].getFirstName().toLowerCase()) < 0)
                {
                    count = j;

                    temp = people[i];
                    people[i] = people[count];
                    people[count] = temp;
                }
            }
        }
    }

    // Method to get details of person specified by Last name
    // Postcondition: toString of object people[i] is returned
    // returns a string with nothing if not in address book
    public String getByLast(String last)
    {
        for (int i = 0; i < peopleCount; i++)
        {
            if (people[i].getLastName().toLowerCase().compareTo(last.toLowerCase()) == 0)
                return people[i].toString();
        }

        return "";
    }

    // Method to get details of person specified by first name
    // Postcondition: toString of object people[i] is returned
    // returns a string with nothing if not in address book
    public String getByFirst(String first)
    {
        for (int i = 0; i < peopleCount; i++)
        {
            if (people[i].getFirstName().toLowerCase().compareTo(first.toLowerCase()) == 0)
                return people[i].toString();
        }

        return "";
    }

    // Method to print all people with specified month
    // Postcondition: details are printed on console formatted according to month
    public void printByMonth(int month)
    {
        System.out.println(String.format("%-30s %-15s %-15s %-20s%-67s", "Name", "Affiliation", "Birthday", "Phone Number", "Address"));

        for (int i = 0; i < peopleCount; i++)
        {
            if (people[i].getbDay().getMonth() == month)
                System.out.println(people[i].toString());
        }
    }

    // Method to print all people that have birthdays in between date1 and date2
    // Postcondition: details are printed on console formatted according to date
    public void printBetweenDates(Date date1, Date date2)
    {
        System.out.println(String.format("%-30s %-15s %-15s %-20s%-67s", "Name", "Affiliation", "Birthday", "Phone Number", "Address"));

        for (int i = 0; i < peopleCount; i++)
        {
            if (people[i].getbDay().compareTo(date1) >= 0 && people[i].getbDay().compareTo(date2) <= 0)
                System.out.println(people[i]);
        }
    }

    // Method to print all people that have names in between strings last1 and last2
    // Postcondition: details are printed on console formatted according to last name
    public void printBetweenNames(String last1, String last2)
    {
        System.out.println(String.format("%-30s %-15s %-15s %-20s%-67s", "Name", "Affiliation", "Birthday", "Phone Number", "Address"));

        for (int i = 0; i < peopleCount; i++)
        {
            if (people[i].getLastName().toLowerCase().compareTo(last1.toLowerCase()) <= 0
                && people[i].getLastName().toLowerCase().compareTo(last2.toLowerCase()) >= 0)
                System.out.println(people[i].toString());
        }
    }

    // Method to print absolutely everything recorded
    public void printAll()
    {
        System.out.println(String.format("%-30s %-15s %-15s %-20s%-67s", "Name", "Affiliation", "Birthday", "Phone Number", "Address"));

        for (int i = 0; i < peopleCount; i++)
            System.out.println(people[i].toString());
    }
}