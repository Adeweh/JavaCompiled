package JavaFlex;

import java.util.Scanner;

public class GuessGame3 {
    public static void main(String[] args) {
        int masterGuess = 22;

        Scanner userInput = new Scanner(System.in);


        int number = 0;

        do {
            System.out.print("Guess a number: ");
            number = userInput.nextInt();


            if (number > masterGuess)
                System.out.println("Too high, Try again");
            if (number < masterGuess)
                System.out.println("Too low, Try again");
            if (number == masterGuess)
                System.out.println("Correct");
        }
        while (masterGuess != number);

        }
    }


