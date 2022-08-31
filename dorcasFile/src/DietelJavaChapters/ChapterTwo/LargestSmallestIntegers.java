package DietelJavaChapters.ChapterTwo;

import java.util.Scanner;

public class LargestSmallestIntegers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int numberOne = userInput.nextInt();

        System.out.print("Enter second integer: ");
        int numberTwo = userInput.nextInt();

        System.out.print("Enter third integer: ");
        int numberThree = userInput.nextInt();

        System.out.print("Enter fourth integer: ");
        int numberFour = userInput.nextInt();

        System.out.print("Enter fifth integer: ");
        int numberFive = userInput.nextInt();

        int largest = numberOne;
        if (numberTwo > largest) largest = numberTwo;
        if (numberThree > largest) largest = numberThree;
        if (numberFour > largest) largest = numberFour;
        if (numberFive > largest) largest = numberFive;

        int smallest = numberOne;
        if (numberTwo < smallest) smallest = numberTwo;
        if (numberThree < smallest) smallest = numberThree;
        if (numberFour < smallest) smallest = numberFour;
        if (numberFive< smallest) smallest = numberFive;

        System.out.printf("Largest is: %d%n", largest);
        System.out.printf("Smallest is: %d%n", smallest);



    }
}
