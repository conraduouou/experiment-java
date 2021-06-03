/**
 * Class file of ExtPerson that extends Person class
 */

public class ExtPerson extends Person
{
    private String affiliation;     // variable to store relationship with person
    private Date bDay;              // variable to store birthdate of person
    private Address address;        // variable to store the address of person
    private String phone;           // variable to store phone number of person

    // Default constructor
    // Default values are assigned to each instance variable
    public ExtPerson()
    {
        super();
        setAffiliation("");
        bDay = new Date();
        address = new Address();
        setPhone("");
    }

    // Method to set the affiliation of the person with the user
    // Postcondition: affiliation = temp;
    public void setAffiliation(String temp)
    {
        affiliation = temp;
    }

    // Method to set the birthdate of the person
    // Postcondition: a Date object is set using the parameters
    public void setbDay(int month, int days, int year)
    {
        bDay.setDate(month, days, year);
    }

    // Method to set the address of the person
    // Postcondition: the Address object is set using the parameters
    public void setAddress(String street, String city, String state, String zipCode)
    {
        address.setAddress(street, city, state, zipCode);
    }

    // Method to set the number of the person
    // Postcondition: phone = number;
    public void setPhone(String number)
    {
        phone = number;
    }

    // Method to set the affiliation of the person with the user
    // Postcondition: affiliation = temp;
    public String getAffiliation()
    {
        return affiliation;
    }

    // Method to set the birthdate of the person
    // Postcondition: a Date object is set using the parameters
    public Date getbDay()
    {
        return bDay;
    }

    // Method to set the address of the person
    // Postcondition: the Address object is set using the parameters
    public Address getAddress()
    {
        return address;
    }

    // Method to set the number of the person
    // Postcondition: phone = number;
    public String getPhone()
    {
        return phone;
    }

    // Method to use to print all details of the person on screen
    public void printAll()
    {
        System.out.println(toString());
    }

    // Method inexplicitly used when object called in a print function
    // Can also be explicitly used to convert all details into a string
    public String toString()
    {
        String temp = super.toString();

        return String.format("%-30s %-15s %-15s %-20s", temp, affiliation, bDay.toString(), phone) + address;
    }
}
