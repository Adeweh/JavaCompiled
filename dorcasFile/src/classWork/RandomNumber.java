package classWork;

//Generate a random number and ask user to guess number
//if userGuess > random number = too high, try again
//if userGuess < random number = too low, try again

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 51);

        Scanner userInput = new Scanner(System.in);

        System.out.println("Guess a random number between 0-50: ");

        int userGuess = -1;
        while (userGuess != randomNumber){

            System.out.print("Enter a guess number: ");
            userGuess = userInput.nextInt();

            if (userGuess == randomNumber)
                System.out.println("Correct guess number " + randomNumber);
            else if (userGuess > randomNumber) {
                System.out.println("too high, try again");
            } else
                System.out.println("too low, try again");

        }

    }
}


