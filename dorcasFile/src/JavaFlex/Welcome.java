package JavaFlex;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = userInput.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = userInput.nextInt();

        if (number1 == number2) {
            System.out.printf("%d == %d%n", number1, number2);
        }
        if (number1 != number2) {
            System.out.printf("%d != %d%n", number1, number2);
        }
        if (number1 < number2) {
            System.out.printf("%d < %d%n", number1, number2);
        }
        if (number1 > number2) {
            System.out.printf("%d > %d%n", number1, number2);
        }
        if (number1 <= number2) {
            System.out.printf("%d <= %d%n", number1, number2);
        }
        if (number1 >= number2) {
            System.out.printf("%d >= %d%n", number1, number2);


        }
    }
}
