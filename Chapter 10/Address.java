/**
 * Class file of Address
 * 
 * 03-23-2021
 */

public class Address
{
    // variables to hold certain information needed for an address
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;

    // Default constructor
    // sets all values to default, that is, blank strings
    // Postcondition: all values are set to "N/A"
    public Address()
    {
        setStreet("N/A");
        setCity("N/A");
        setState("N/A");
        setZipCode("N/A");
    }

    // Constructor with parameters
    // sets all values accordingly in the order street, city, state, zipcode
    // Postcondition: streetAddress = street; city = temp1; state = temp2; zipCode = temp3;
    public Address(String street, String temp1, String temp2, String temp3)
    {
        setStreet(street);
        setCity(temp1);
        setState(temp2);
        setZipCode(temp3);
    }

    // Method to set the instance variable streetAddress according to parameter
    // Postcondition: streetAddress = street
    public void setStreet(String street)
    {
        streetAddress = street;
    }

    // Method to set the instance variable city according to parameter
    // Postcondition: city = temp;
    public void setCity(String temp)
    {
        city = temp;
    }

    // Method to set the instance variable state according to parameter
    // Postcondition: state = temp;
    public void setState(String temp)
    {
        state = temp;
    }

    // Method to set the instance variable zipCode according to parameter
    // Postcondition: zipCode = temp;
    public void setZipCode(String temp)
    {
        zipCode = temp;
    }

    // Method to set all variables according to the parameters
    public void setAddress(String street, String temp1, String temp2, String temp3)
    {
        streetAddress = street;
        city = temp1;
        state = temp2;
        zipCode = temp3;
    }

    // Method to return instance variable streetAddress
    public String getStreet()
    {
        return streetAddress;
    }
    
    // Method to return instance variable city
    public String getCity()
    {
        return city;
    }

    // Method to return instance variable state
    public String getState()
    {
        return state;
    }

    // Method to return instance variable zipCode
    public String getZipCode()
    {
        return zipCode;
    }

    // Method to return string of the address as a whole
    public String getAddress()
    {
        return toString();
    }

    // Method to be used when object is called explicitly in print function
    public String toString()
    {
        return String.format("%-24s %-20s %-15s %-8s", streetAddress, city, state, zipCode); 
    }
}
