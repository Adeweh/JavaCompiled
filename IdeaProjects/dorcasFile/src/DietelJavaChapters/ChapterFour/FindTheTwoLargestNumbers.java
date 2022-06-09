package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class FindTheTwoLargestNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int counter = 1;
        int largest1 = 0;
        int largest2 = 0;

        System.out.print("Enter 10 integers: ");


        while (counter <= 10) {

            int number = userInput.nextInt();

            if (number >= largest1){
                largest2 = largest1;
                largest1 = number;
            }

            else if (number > largest2)
                largest2 = number;
            counter++;

        }
        System.out.printf("The two Largest Integers are %d  %d%n ", largest1, largest2);

    }
}



