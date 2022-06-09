package DietelJavaChapters.ChapterTwo;

import java.util.Scanner;

public class NegativePositiveZeroValue {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int zero = 0;
        int positives = 0;
        int negatives = 0;


        System.out.println("Enter five numbers: ");
        int number1 = userInput.nextInt();
        int number2 = userInput.nextInt();
        int number3 = userInput.nextInt();
        int number4 = userInput.nextInt();
        int number5 = userInput.nextInt();


        if (number1 == 0)
            zero++;
        if (number2 == 0)
            zero++;
        if (number3 == 0)
            zero++;
        if (number4 == 0)
            zero++;
        if (number5 == 0)
            zero++;

        if (number1 < 0)
            negatives++;
        if (number2 < 0)
            negatives++;
        if (number3 < 0)
            negatives++;
        if (number4 < 0)
            negatives++;
        if (number5 < 0)
            negatives++;

        if (number1 > 0)
            positives++;
        if (number2 > 0)
            positives++;
        if (number3 > 0)
            positives++;
        if (number4 > 0)
            positives++;
        if (number5 > 0)
            positives++;

        System.out.printf("number of Zeros: %d%n ", zero);
        System.out.printf("number of positives: %d%n ", positives);
        System.out.printf("number of negatives: %d%n ", negatives);
    }
}
