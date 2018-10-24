package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        boolean guessed = false;
        int attempts = 0;
        int num = 24;
        int min = 0;
        int max = 50;
        String input;
        Scanner in;

        String pool [] = {"James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William", "Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles", "Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald", "Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth", "Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward", "Deborah"};
        Arrays.sort(pool);

        //Prints out name
        System.out.println("\n" + Arrays.toString(pool));

        //Instructions to user
        System.out.println("\nGuess My Name\n\nInstructions:\n\tChoose a name from the list provided above.\n\tThe program will ask a name. Respond accordingly with \"a\" or \"z\" depending on which it is closer to.\n\tIf that is your name enter \"correct\"");
        System.out.println("\nFirst name: \"" + pool[num] + "\". Correct, closer to a, or closer to z?");

        //Creates a loop that goes provided the user did program did not guess to number and less or equal that 4 attempts have been made
        while(!guessed && attempts <= 4)
        {
            in = new Scanner(System.in);
            input = in.nextLine();

            //Guesses number by finding the name in the middle of the range (ex. 50 names would start at 25, 25 names would start at 12).

            if (Objects.equals(input.toLowerCase(), "correct"))
            {
                guessed = true;
                attempts++;
            }

            else if (Objects.equals(input.toLowerCase(), "z"))
            {
                min = num;
                num = (min + max) / 2;
                System.out.println("Next name: " + pool[num]);
                attempts++;
            }

            else if (Objects.equals(input.toLowerCase(), "a"))
            {
                max = num;
                num = (min + max) / 2;
                System.out.println("Next name: " + pool[num]);
                attempts++;
            }

            else //Fail-safe, if user inputs a non-specified input, the program will not continue
            {
                System.out.println("Invalid input, please insure you are using only the three possible input explained in the instructions");
            }

            //Since at most it can take is 6 guesses to guess 1 of 50 names, after 5 guesses it breaks the loop (guessed = true) and provides the user with the only other possible name.
            if(attempts == 5 && !guessed)
            {
                attempts++;
                guessed = true;
            }

        }

        System.out.println("\nThe name you selected was " + pool[num] + "\nAttempts taken: " + attempts);

    }

}