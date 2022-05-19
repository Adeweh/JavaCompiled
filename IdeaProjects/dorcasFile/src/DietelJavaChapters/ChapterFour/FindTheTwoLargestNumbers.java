package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class FindTheTwoLargestNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int counter = 1;
        int largest1 = 0;
        int largest2 = 0;

        for (int i=0;i<=10;i++) {

            System.out.printf("Enter 10 integers: ");
            int number = userInput.nextInt();

            if (counter >= 1)
                largest1 = number;
            else if (number > largest2)
                largest2 = number;
            counter++;

        }
        System.out.printf("The two Largest Integers are %d  %d%n ", largest1, largest2);

    }
}



