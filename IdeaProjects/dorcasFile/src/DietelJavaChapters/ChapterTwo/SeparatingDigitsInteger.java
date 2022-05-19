package DietelJavaChapters.ChapterTwo;

import java.util.Scanner;

public class SeparatingDigitsInteger {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a five-digit integer: ");
        int number = userInput.nextInt();

        int numberOne = number % 10;
        number /= 10;

        int numberTwo = number % 10;
        number /= 10;

        int numberThree = number % 10;
        number /= 10;

        int numberFour = number % 10;
        number /= 10;

        int numberFive = number % 10;
        number /= 10;

        System.out.printf("%d   %d   %d   %d   %d%n", numberFive, numberFour, numberThree, numberTwo, numberOne);




    }
}
