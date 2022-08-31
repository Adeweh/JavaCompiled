package DietelJavaChapters.ChapterTwo;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int numberOne = userInput.nextInt();

        System.out.print("Enter second integer: ");
        int numberTwo = userInput.nextInt();

        int tripledNumberOne = numberOne * numberOne * numberOne;
        int doubledNumberTwo = numberTwo * numberTwo;

        if (tripledNumberOne % doubledNumberTwo == 0)
            System.out.printf("%d is a multiple of of %d%n", tripledNumberOne, doubledNumberTwo);
        if (tripledNumberOne % doubledNumberTwo != 0)
            System.out.printf("%d is not a multiple of of %d%n", tripledNumberOne, doubledNumberTwo);

    }
}
