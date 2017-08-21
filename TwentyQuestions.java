/******************************************************************************
 *  Compilation:  javac TwentyQuestions.java
 *  Execution:    java TwentyQuestions
 *  Dependencies  StdIn.java
 *
 *  % java TwentyQuestions 
 *  I'm thinking of a number between 1 and 1,000,000 
 *  What's your guess? 500000 
 *  Too high 
 *  What's your guess? 250000 
 *  Too low 
 *  What's your guess? 375000 
 *  Too high 
 *  What's your guess? 312500 
 *  Too high 
 *  What's your guess? 300500 
 *  Too low 
 *  ... 
 *
 ******************************************************************************/

import java.util.Scanner;

public class TwentyQuestions {

    
    public static void main(String[] args) {

        // Generate a number and answer questions
        // while the user tries to guess the value.
        int secret = 1 + (int) (Math.random() * 1000000);

        System.out.print("I'm thinking of a number ");
        System.out.println("between 1 and 1,000,000");
         Scanner stdIn = new Scanner(System.in);
         
         int guess=0;
           
            
        while (guess != secret) {

            // Solicit one guess and provide one answer
            System.out.print("What's your guess? ");
            //Scanner guess = new Scanner(System.in);
            guess = stdIn.nextInt();
            
            if      (guess == secret) System.out.println("You win!");
            else if (guess  < secret)  System.out.println("Too low ");
            else if (guess  > secret)  System.out.println("Too high");
        }
    }
} 
