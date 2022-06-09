package DietelJavaChapters.ChapterTwo;

import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int numberOne = userInput.nextInt();

        System.out.print("Enter second integer: ");
        int numberTwo = userInput.nextInt();

        System.out.print("Enter third integer: ");
        int numberThree = userInput.nextInt();

        int sum = numberOne + numberTwo + numberThree;
        int average = sum / 3;
        int product = numberOne * numberTwo * numberThree;

        int largest = numberOne;
        if (numberTwo > largest) largest = numberTwo;
        if (numberThree > largest) largest = numberThree;

        int smallest = numberOne;
        if (numberTwo < smallest) smallest = numberTwo;
        if (numberThree < smallest) smallest = numberThree;

        System.out.printf("Sum is: %d%n", sum);
        System.out.printf("Average is: %d%n", average);
        System.out.printf("Product is: %d%n", product);
        System.out.printf("Largest is: %d%n", largest);
        System.out.printf("Smallest is: %d%n", smallest);


    }
}
