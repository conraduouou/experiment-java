/**
 * Program that takes in 50 students' names and scores, computes the average
 * and as well as the students who are below average and those above
 * 
 * 03-21-2021
 */
import java.util.*;
import java.io.*;

public class ch9_8 
{
    // main
    public static void main(String[] args) throws FileNotFoundException
    {
        // initialize Scanner object to take in data
        Scanner inFile = new Scanner(new FileReader("ch9_8test.txt"));

        // variables
        String[] names = new String[15];
        int[] scores = new int[15];

        int count = 0;
        int sum = 0;
        int highest = 0;

        // take in values
        while (inFile.hasNext() && count < names.length)
        {
            names[count] = inFile.next();
            scores[count] = inFile.nextInt();

            if (highest < scores[count])
                highest = scores[count];

            sum += scores[count];
            
            count++;
        }

        // print out below average students
        System.out.println("STUDENTS THAT ARE BELOW AVERAGE.");
        for (int i = 0; i < scores.length; i++)
        {
            if (scores[i] < ((double) (sum) / (double) (scores.length)))
            {
                System.out.println(names[i]);
            }
        }

        System.out.println();

        // print out above average students
        System.out.println("STUDENTS THAT GOT THE HIGHEST SCORE");
        for (int i = 0; i < scores.length; i++)
        {
            if (scores[i] == highest)
                System.out.println(names[i]);
        }

        inFile.close();
    }
}
