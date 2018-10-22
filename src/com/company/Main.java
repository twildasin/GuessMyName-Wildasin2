package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        boolean guessed = false;
        int attempts = 0;
        int num = 50;
        int min = 1;
        int max = 101;
        String input = "";
        Scanner in;
        String pool [] = {"James", "Mary", "John", " Patricia", "Robert", "Jennifer", "Michael", "Linda", "William", "Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles", "Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald", "Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth", "Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward", "Deborah"};
        //Arrays.sort(pool);
        
        System.out.println(pool);
        int list [] = new int [50];


        System.out.println("Guess My Name\n\nInstructions:\nThe program will provide a list of names. Choose one name.\nThe program will ask a name. Respond accordingly with \"a\" or \"z\" depending on which it is closer to.\nIf that is your name enter: \"correct\"");

        System.out.println("\nFirst number: 50. Correct, closer to a, or closer to z?");

        while(guessed == false && attempts <= 5)
        {
            in = new Scanner(System.in);
            input = in.nextLine();

            if (Objects.equals(input.toLowerCase(), "correct"))
            {
                guessed = true;
                attempts++;
            }

            else if (Objects.equals(input.toLowerCase(), "higher"))
            {
                //System.out.println(input);
                min = num;
                num = (min + max) / 2;
                System.out.println("Next number: " + num);
                attempts++;
            }

            else if (Objects.equals(input.toLowerCase(), "lower"))
            {
                max = num;
                num = (min + max) / 2;
                System.out.println("Next number: " + num);
                attempts++;
            }

            else
            {
                System.out.println("Invalid input, please insure you are using only the three possible input explained in the instructions");
            }

            if(attempts == 6 && guessed == false)
            {
                attempts++;
                guessed = true;
            }


        }

        System.out.println("\nYour number is " + num + "\nAttempts taken: " + attempts);

    }
}