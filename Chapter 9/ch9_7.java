/**
 * Program that lets user input last names of candidates and as well as their
 * number of votes in a local election
 * 
 * 03-21-2021
 */
import java.util.*;

public class ch9_7
{
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        // variables
        String[] candidates = new String[5];
        int[] votes = new int[5];
        int total = 0, winIndex = 0, highestVotes = 0;

        System.out.println("LOCAL ELECTION>!!>!!?!?");

        // prompt
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Input last name of candidate: ");
            candidates[i] = console.next();

            System.out.print("Input number of votes of " + candidates[i] + ": ");
            votes[i] = console.nextInt();
            
            total += votes[i];      // add votes to total

            // record array index of winner and their vote count
            if (highestVotes < votes[i])
            {
                highestVotes = votes[i];
                winIndex = i;
            }

            System.out.println();
        }

        // Print results
        System.out.println("Candidate    Votes Received      % of Total Votes");

        for (int i = 0; i < 5; i++)
        {
            System.out.println(candidates[i] + String.format("%18d", votes[i]) + String.format("%22.2f",  ((double) (votes[i]) / (double) (total)) * 100.00));
        }

        System.out.println("Total " + String.format("%17d", total));
        System.out.println("The winner of the election is " + candidates[winIndex]);

    }
}