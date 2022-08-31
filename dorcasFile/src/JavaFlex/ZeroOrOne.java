package JavaFlex;

import java.util.Scanner;

public class ZeroOrOne {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number between 1 or 0: ");
        int number = userInput.nextInt();

        if (number == 1) {
            System.out.println("The number is 0");
        }
       else if (number == 0) {
            System.out.println("The number is 1");
            }

        else {
            System.out.println("Restart and enter a number between 1 or 0");


        }

    }
}

