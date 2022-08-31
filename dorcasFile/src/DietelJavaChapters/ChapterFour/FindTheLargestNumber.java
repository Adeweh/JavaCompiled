package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

//initialize counter to 1
//initialize largest to 0
//while counter is less than or equal to 10
//prompt the user to enter an integer
//initialize integer as number
//if counter is equal to 1; else if number is greater than largest - largest equals number

public class FindTheLargestNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int counter = 1;
        int largest = 0;

        while (counter <= 10) {

            System.out.print("Enter an integer: ");
            int number = userInput.nextInt();

         if (number > largest)
                    largest = number;
                counter = counter + 1;

            }
            System.out.printf("The Largest Integer is %d%n ", largest);

        }
    }

