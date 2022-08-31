package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        int rev = 0;


        System.out.println("Enter a 5 digit number: ");

        int number = userInput.nextInt();
        int half = number / 2;

        if (number / 10000 >= 1 && number / 100000 < 1){
            while (number != 0){

                int remainder = number % 10;
                rev = rev * 10 + remainder;

                number /= 10;

            }
            int halfRev = rev / 2;


            if (half == halfRev) {
                System.out.println("Number is a palindrome");
            }else{
                System.out.println("Number is not a palindrome");

            }

        }

    }


        }
