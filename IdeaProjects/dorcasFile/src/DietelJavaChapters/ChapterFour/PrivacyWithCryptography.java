package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class PrivacyWithCryptography {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter 4 digit data: ");
        int data = userInput.nextInt();

        int lastDigit = data % 10;
        int thirdDigit = ((data % 100) - lastDigit) / 10;
        int secondDigit = (((data % 1000) - thirdDigit * 10) - lastDigit)/ 100;
        int firstDigit = ((((data % 10000) - secondDigit * 100) - thirdDigit * 10) - lastDigit)/ 1000;

        int newFirstDigit = (firstDigit + 7) % 10;
        int newSecondDigit = (secondDigit + 7) % 10;
        int newThirdDigit = (thirdDigit + 7) % 10;
        int newLastDigit = (lastDigit + 7) % 10;

        int encrypt = (newThirdDigit * 1000) + (newLastDigit * 100) + (newFirstDigit * 10) + (newSecondDigit);

        System.out.printf("Your encrypted data is %04d", encrypt);
    }
}
