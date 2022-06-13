package JavaFlex;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int masterGuess = 22;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Guess a number: ");
        int number = userInput.nextInt();

        if (number > masterGuess)
            System.out.println("Too high, Try again");
        if (number < masterGuess)
            System.out.println("Too low, Try again");
        if (number == masterGuess)
            System.out.println("Correct");


    }
}
