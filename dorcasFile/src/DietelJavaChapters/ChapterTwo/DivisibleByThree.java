package DietelJavaChapters.ChapterTwo;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = userInput.nextInt();

        if (number % 3 == 0){
            System.out.println("Divisible by 3");}
        if (number % 3 != 0){
            System.out.println("not divisible by 3");
        }

    }
}
