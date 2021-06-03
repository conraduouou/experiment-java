import java.util.*;

public class TelephoneNumber 
{
    
    // instantiate Scanner object as console
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        // declare variables; 
        String number;
        char response;
        
        System.out.println("TELEPHONE PROGRAM!");
        
        do
        {
            int counter = 0;
            // prompt user to input number expressed in letters..
            System.out.print("Please input telephone number expressed in letters: ");
            number = console.next().toLowerCase();
            
            boolean invalid = false;

            // must take in hyphen as well and skip over
            for (int i = 0; (i < 7) && (i < number.length()); i++)
            {
                if (invalid)
                    break;
                
                // print out number according to character input
                switch (number.charAt(i)) 
                {
                    case '-':
                        break;
                    case 'a': case 'b': case 'c':
                        System.out.print("2");
                        break;
                    case 'd': case 'e': case 'f':
                        System.out.print("3");
                        break;
                    case 'g': case 'h': case 'i':
                        System.out.print("4");
                        break;
                    case 'j': case 'k': case 'l':
                        System.out.print("5");
                        break;
                    case 'm': case 'n': case 'o':
                        System.out.print("6");
                        break;
                    case 'p': case 'q': case 'r': case 's': 
                        System.out.print("7");
                        break;
                    case 't': case 'u': case 'v':
                        System.out.print("8");
                        break;
                    case 'w': case 'x': case 'y': case 'z':
                        System.out.print("9");
                        break;
                    default:
                        System.out.println("\nInvalid output.");
                        invalid = true;
                }

                if (i == 2)
                    System.out.print("-");

                counter++;
            }

            if (number.length() < 8)
            {
                for (int i = 0; i < 7 - counter; i++)
                    System.out.print("0");
            }

            System.out.println();
            
            System.out.print("Would you like to try again? (Y/N) : ");
            response = console.next().charAt(0);
        }
        while (response == 'y' || response == 'Y');
    }
    
}
