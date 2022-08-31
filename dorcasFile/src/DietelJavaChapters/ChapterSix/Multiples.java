package DietelJavaChapters.ChapterSix;

import java.util.Scanner;

public class Multiples {
    public static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter first Number: ");
        int firstNumber = userInput.nextInt();

        System.out.print("Enter second Number: ");
        int secondNumber = userInput.nextInt();

        System.out.println(isMultiple());


    }
    public static boolean isMultiple(){
        int firstNumber = 0;
        int secondNumber = 0;
        if (secondNumber % firstNumber == 0){
            System.out.println(true);
        }


        return false;
    }

}
