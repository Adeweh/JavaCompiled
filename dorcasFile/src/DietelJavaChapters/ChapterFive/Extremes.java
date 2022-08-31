package DietelJavaChapters.ChapterFive;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a set of 15 numbers: ");


        int maxNumber = 0;
        int miniNumber = 1000000;

        for (int i = 1; i <= 15; i++) {
            int numbers = userInput.nextInt();
            if(numbers > maxNumber){
                maxNumber = numbers;
            }
            else  if (numbers < maxNumber){
                miniNumber = numbers;
            }

        }
        int sum = maxNumber + miniNumber;
        System.out.printf("The maximum and minimum number is: %d, %d\n ", maxNumber, miniNumber);
        System.out.printf("The sum of the two extremes: %d", sum);
    }
}
