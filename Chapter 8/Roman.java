// class Roman
public class Roman
{
    // Method to convert any given roman numeral to decimal
    // returns 0 if given literal is not a roman numeral
    // Postcondition: any given literal
    public static int romanToDecimal(String rNumeral)
    {
        int number = 0;

        if (!isRoman(rNumeral))
            return 0;
        else
        {
            int i = 0;
            while (i < rNumeral.length())
            {
                if (i == rNumeral.length() - 1)
                    number += romanToDecimal(rNumeral.charAt(i));
                else if (romanToDecimal(rNumeral.charAt(i)) < romanToDecimal(rNumeral.charAt(i + 1)))
                {
                    number += romanToDecimal(rNumeral.charAt(i + 1)) - romanToDecimal(rNumeral.charAt(i));
                    i += 2;
                    continue;
                }
                else
                    number += romanToDecimal(rNumeral.charAt(i));
                
                i++;
            }
        }

        return number;
    }

    // Private method to get int from single roman numeral digit
    // Postcondition: a temporary initialized variable is returned after doing check
    private static int romanToDecimal(char rNumeral)
    {
        int number = 0;

        switch (Character.toUpperCase(rNumeral))
        {
            case 'M':
                number = 1000;
                break;
            case 'D':
                number = 500;
                break;
            case 'C':
                number = 100;
                break;
            case 'L':
                number = 50;
                break;
            case 'X':
                number = 10;
                break;
            case 'V':
                number = 5;
                break;
            case 'I':
                number = 1;
                break;
        }

        return number;
    }

    // Private method to determine if any roman numeral is indeed a roman numeral
    // Postcondition: returns true if given variable is indeed roman numeral, otherwise, returns false
    public static boolean isRoman(String rNumeral)
    {
        for (int i = 0; i < rNumeral.length(); i++)
        {
            if (!isRoman(rNumeral.charAt(i)))
                return false;
        }

        return true;
    }

    // Private method to determine if any single character value is indeed a roman numeral
    // Postcondition: returns true if given character is indeed roman numeral, otherwise, returns false
    public static boolean isRoman(char rNumeral)
    {
        switch (Character.toUpperCase(rNumeral))
        {
            case 'M':
            case 'D':
            case 'C':
            case 'L':
            case 'X':
            case 'V':
            case 'I':
                return true;
            default:
                return false;
        }
    }
}