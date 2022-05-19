package DietelJavaChapters.ChapterSix;

import java.util.Scanner;

public class CalculatingTheSumOfDigits {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter four digit number: ");
        int number = userInput.nextInt();

        int sum = digits(number);

        System.out.println(sum);

    }
    public static int digits (int number){

        int firstDigit = number / 1000;
        int secondDigit = number / 100 - (firstDigit * 10);
        int thirdDigit = number / 10 - (firstDigit * 100 + secondDigit * 10 );
        int fourthDigit = number - (firstDigit *  1000 + secondDigit * 100 + thirdDigit * 10);

        int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;

        return sum;
    }
}
