package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int number;

        String in = "";

        do {
            System.out.print("Enter the length of the base of a triangle between 1 and 10: ");
            number = userInput.nextInt();

            if (number <= 10) {
                for (int i = 0; i <= number; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                break;
            } else {
                in = "invalid input";
                System.out.println(in);
            }

        } while (in == "invalid input");


    }
}

