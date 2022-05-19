package classWork;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = userInput.nextInt();

        long factorial = 1;
        for (int i=1; i <=number; ++i){
            factorial= factorial * i;
        }
        System.out.println("The factorial of the number: " + factorial);
    }
}
