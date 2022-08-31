package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class ReadingNumbersUntilSpecifiedSum {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = userInput.nextInt();

        System.out.println("Enter a lesser number: ");
        int lessNumber = userInput.nextInt();

        int sum = 0;
        while (sum < number){
            System.out.println("Enter a lesser number: ");
            lessNumber = userInput.nextInt();

            sum+= lessNumber;

        }
        System.out.println("The sum of the integers equals or is greater than the number entered");
    }
}
