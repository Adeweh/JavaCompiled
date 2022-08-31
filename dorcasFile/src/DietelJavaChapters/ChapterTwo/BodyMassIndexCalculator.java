package DietelJavaChapters.ChapterTwo;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double bmi;

        System.out.print("Enter weight in kilograms: ");
        double weight = userInput.nextInt();

        System.out.print("Enter height in meters: ");
        double height = userInput.nextInt();

        bmi = weight / (height * height);

        System.out.printf("The user's body mass index is: %.4f", bmi);
    }
}
