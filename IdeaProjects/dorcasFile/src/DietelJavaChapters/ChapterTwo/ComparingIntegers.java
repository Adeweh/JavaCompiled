package DietelJavaChapters.ChapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        int number;

        Scanner userInput = new Scanner(System.in);


        System.out.print("Enter Integer: ");
        number = userInput.nextInt();
        int numberSquared = number * number;

        if (number  == 100) {
            System.out.printf("%d is equal to 100\n", number);}
        if (number != 100 ) {
            System.out.printf("%d is not equal to 100\n", number);
        }
        if (number < 100){
            System.out.printf("%d is less than 100\n", number);
        }
        if (number> 100){
            System.out.printf("%d is greater than 100\n", number);}

        if ( numberSquared == 100) {
            System.out.printf("%d is equal to 100\n", numberSquared);}
        if ( numberSquared != 100 ) {
            System.out.printf("%d is not equal to 100\n", numberSquared);
        }
        if (numberSquared < 100){
            System.out.printf("%d is less than 100\n", numberSquared);
        }
       if (numberSquared > 100)
            System.out.printf("%d is greater than 100\n", numberSquared);
    }
}
