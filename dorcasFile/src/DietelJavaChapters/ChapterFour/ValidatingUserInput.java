package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int result = 0;

        while (result != 1 && result != 2) {

            System.out.print("Enter number: ");
            result = userInput.nextInt();

            if (result == 1 || result == 2) {
                System.out.println("Passed");}
                else {
                    System.out.println("Failed");
                }

            }


        }
    }

