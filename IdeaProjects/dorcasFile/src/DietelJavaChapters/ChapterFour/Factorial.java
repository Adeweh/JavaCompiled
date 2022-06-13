package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a non negative integer");
        int integer = userInput.nextInt();

        //int number = integer;
        int factorial = 1;

        while (integer > 0){
            factorial = factorial * integer;
            integer--;
        }
        System.out.printf("The value of %d! is %d", integer, factorial);

    }
}
