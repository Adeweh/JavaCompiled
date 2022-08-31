package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class CreatingComparator {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int number1 = userInput.nextInt();

        System.out.print("Enter second Number: ");
        int number2 = userInput.nextInt();

        if (number1 == number2){
            System.out.println(0);
        }
        else if (number1 > number2){
            System.out.println(1);
        }else System.out.println(-1);
    }
}
