package dorcas;

import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int sum = 0;
        char input;
        do{
            System.out.print("Enter two numbers: ");
            int number1= userInput.nextInt();
            int number2 = userInput.nextInt();

            sum += number1+number2;
            System.out.println("Do you wish to perform another operation, Y/N");
            input =userInput.next().charAt(0);
        }while(input =='Y'||input =='y');

        System.out.println("sum "+sum);
    }
}


