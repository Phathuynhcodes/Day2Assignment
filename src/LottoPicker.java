/*
LottoPicker will generate and print out 5 distinct random numbers between 0-30 to the user
 1 - figure out how to generate a random number
 2 - repeat step 1, 5 times
 3 - we need to store the results of step 2
 4 - we need to find a way to print the results that were stored along the way
*/
// this is a single line

// casing?? where are the capital
//       PascalCase - where the first letter and every first letter of every new word is capitalized.
//       camelCase - the first letter of the first word is lower case, but every other first letter is capitalized

import java.util.Random;

public class LottoPicker {
    public static void main(String[] args) {
        // dataType variableName = theValueToBeStored
        String nameOfIt = "Application started...";
        System.out.println(nameOfIt);


        Random random = new Random();

        int numberOfNumbersGenerated = 0;
        int total = 5;

        while(numberOfNumbersGenerated < total){
            int randomNumber = random.nextInt(30);
            System.out.println(randomNumber);
            numberOfNumbersGenerated = numberOfNumbersGenerated + 1;
        }
        // numberOfNumbersGenerated < total
        // needs to be a statement that evaluated to true or false



        /*

         Programming is the combination of iteratives and conditionals
             Iteratives - repeating a processes over and over
             Conditional - checking a condition (true/false) to decide what to do or if I should keep doing something
         Control Flow - Different types of statements that affect the flow of a program
             Iterative - Loops:
                    while loop - while a condition is true; keep executing
                    do while loop - similar to a while loop, guaranteed to run once

             Condition -
                    if - checks if a condition is true. If it is it will execute once
                    else - executes if an if statement evaluates to false

         */



    }
}
