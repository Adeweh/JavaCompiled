package classWork;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        int i;
        int number;
        int evenSum = 0;
        int oddSum = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a set of integers: ");
        number = userInput.nextInt();

        for (i=1; i <= number; i++) {
            if (i % 2 == 0)
                evenSum += i;
            else
                oddSum += i;
            }
            System.out.println("Sum of Even numbers: " + evenSum);
            System.out.println("Sum of Odd numbers: " + oddSum);

        }
    }
