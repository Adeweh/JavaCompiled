package JavaFlex;

import java.util.Scanner;

public class GuessGame2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int masterGuess = 22;
        int counter;



        for (counter = 1; counter <= 10; counter++) {
            System.out.println("Guess a number: ");
            int number = userInput.nextInt();

            if (number > masterGuess){
                System.out.println("Too high, Try again");
            }

            else if (number < masterGuess){
                System.out.println("Too low, Try again");
            }
            else{
                System.out.println("Correct");
                break;}

        }


        }
    }

