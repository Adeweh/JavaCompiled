package DietelJavaChapters.ChapterFive;

import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter 5 numbers between 1 to 30: ");
        int firstNumber = userInput.nextInt();
        int secondNumber = userInput.nextInt();
        int thirdNumber = userInput.nextInt();
        int fourthNumber = userInput.nextInt();
        int fifthNumber = userInput.nextInt();

        for (int i = 0; i < firstNumber; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < secondNumber; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < thirdNumber; i++){
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < fourthNumber; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < fifthNumber; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
