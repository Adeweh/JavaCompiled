package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        int number = 0;
        Scanner userInput = new Scanner(System.in);

        while (number < 10000){

        System.out.print("Enter a five digit number: ");
        number = userInput.nextInt();

        if (number < 10000)
            System.out.println("Invalid number. Try again.\n ");
    }
        int reverseNumber = 0;

        while (number > 0){
            int rem = number % 10;
            number /= 10;
            reverseNumber = reverseNumber * 10 + rem;}



        }


    }

