package DietelJavaChapters.ChapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

//        int numberOne;
//        int numberTwo;
//        int sum;
//        int difference;

        System.out.print("Enter first Integer: ");
        int numberOne = userInput.nextInt();

        System.out.print("Enter second Integer: ");
        int numberTwo = userInput.nextInt();

        int numberOneSquared = numberOne * numberOne;
        int numberTwoSquared = numberTwo * numberTwo;

        int addition = numberOne + numberTwo;

        int sum = numberOneSquared + numberTwoSquared;
        int difference = numberOneSquared - numberTwoSquared;

        System.out.printf("Square of first integer is: %d%n ", numberOneSquared);
        System.out.printf("Square of second integer is: %d%n ", numberTwoSquared);
        System.out.printf("Sum of their square is: %d%n ", sum);
        System.out.printf("Difference of their square is: %d%n ", difference);


    }
}

